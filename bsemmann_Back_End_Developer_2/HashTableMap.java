// --== CS400 File Header Information ==--
// Name: Adam Tupitza
// Email: tupitza@wisc.edu
// Team: FF
// Role: Data Wrangler 1
// TA: Abhay Kumar
// Lecturer: Gary Dahl
// Notes to Grader: n/a
import java.util.NoSuchElementException;
import java.util.LinkedList;

/**
 * This class implements a hash table map that stores key-value Pair objects. The storage location
 * of these objects in the underlying array is dependent on the integer value that the key is hashed
 * to. Linked-list chaining is used to handle hash collisions.
 * 
 * @author Adam Tupitza
 *
 * @param <KeyType> generic type for specifying the key
 * @param <ValueType> generic type for specifying the value
 */
public class HashTableMap<KeyType, ValueType> implements MapADT<KeyType, ValueType> {
  
  /**
   * This inner class models a key-value pair to be stored in a hash table.
   *
   * @param <KeyType> the generic type to specify for the key
   * @param <ValueType> the generic type to specify for the value
   */
  private static class Pair<KeyType, ValueType> {
    private KeyType key;
    private ValueType value;
    /**
     * Constructor for a Pair object.
     * 
     * @param key for the pair
     * @param value for the pair
     */
    public Pair(KeyType key, ValueType value) {
      this.key = key;
      this.value = value;
    }
    
    /**
     * Getter method for the key.
     * 
     * @return this pair's key
     */
    public KeyType getKey() {
      return this.key;
    }
    
    /**
     * Getter method for the value.
     * 
     * @return this pair's value
     */
    public ValueType getValue() {
      return this.value;
    }
  }
    
  private LinkedList<Pair<KeyType, ValueType>>[] hashArray;
  private int size;
  private int capacity;
  private static final double MAX_LOAD_FACTOR = .8;
  
  /**
   * Constructor for the HashTableMap with a argument-specified initial capacity.
   * 
   * @param capacity the initial capacity for the HashTableMap
   */
  public HashTableMap(int capacity) {
    hashArray = new LinkedList[capacity];
    this.capacity = capacity;
  }
  
  /**
   * Default constructor for the HashTableMap, sets the initial capacity to 10.
   */
  public HashTableMap() {
    this(10);
  }

  /**
   * This function places a new pair into the Hash Table. Attempts to place a duplicate key into
   * the table are ignored and the table state does not change. If the load factor is exceeded as a
   * result of this pair insertion, the doubleAndRehashArray helper function is invoked.
   * 
   * @param key for the pair to be inserted
   * @param value for the pair to be inserted
   * @return true if the pair was successfully inserted, false otherwise
   */
  @Override
  public boolean put(KeyType key, ValueType value) {   
    int indexToPut = hashFunction(key);
    Pair<KeyType, ValueType> newPair = new Pair<KeyType, ValueType>(key, value);
    
    if (hashArray[indexToPut] == null) { // if null, create new List and add as first item
      LinkedList<Pair<KeyType, ValueType>> newList = new LinkedList<Pair<KeyType,ValueType>>();
      newList.add(newPair);
      hashArray[indexToPut] = newList;
      this.size++;
    } else { // List not null, so add as next item if not already present
      for (int i = 0; i < hashArray[indexToPut].size(); i++) {       
        if (hashArray[indexToPut].get(i).getKey().equals(key)) {
          return false;
          }
        }
      
      hashArray[indexToPut].add(newPair);
      this.size++;
      }
    double loadFactor = this.size/(double)this.capacity; // check if a re-size is required
    if (loadFactor >= MAX_LOAD_FACTOR) {
      doubleAndRehashArray();
    }
    
    return true;
  }

  /**
   * This function attempts to retrieve the value associated with the specified key. If the key
   * is not present in the hash table, a NoSuchElementException is thrown.
   * 
   * @param key whose value is being searched for
   * @return the value associated with the specified key
   * @throws NoSuchElementException
   * 
   */
  @Override
  public ValueType get(KeyType key) throws NoSuchElementException {
    int indexToGet = hashFunction(key);
    
    if (hashArray[indexToGet] == null) {
      throw new NoSuchElementException(); // no items found at the hashedIndex
    } else {
      for (int i = 0; i < hashArray[indexToGet].size(); i++) {
        if (hashArray[indexToGet].get(i).getKey().equals(key)) {
          return hashArray[indexToGet].get(i).getValue();
        }
      }
      throw new NoSuchElementException(); // only other keys were located at the hashedIndex
    }
  }

  /**
   * This function checks the current number of pairs stored in the hash table.
   * 
   * @return the size of the hash table expressed as an integer
   */
  @Override
  public int size() {
    return this.size;
  }

  /**
   * This method checks for the presence of the specified key in the hash table.
   * 
   * @param key the key to be checked for existence in the hash table
   * @return true if the key value is present in the hash table, false otherwise
   */
  @Override
  public boolean containsKey(KeyType key) {
    int indexToCheck = hashFunction(key);
    
    if (hashArray[indexToCheck] == null) {
      return false;
    }
    
    // go through each LinkedList item at the index until key located or list exhausted
    for (int i = 0; i < hashArray[indexToCheck].size(); i++) {
      if (hashArray[indexToCheck].get(i).getKey().equals(key)) {
        return true;
      }
    }
    return false;
  }

  /**
   * This function removes the pair associated with a specified key, assuming the key exists within
   * the hash table. Otherwise, the table remains unchanged and the function returns null.
   * 
   * @param the key to be removed
   * @return the value associated with the removed key (or null if the key was not present)
   */
  @Override
  public ValueType remove(KeyType key) {
    int indexForRemove = hashFunction(key);
    
    if (hashArray[indexForRemove] == null) { // check if key is in hash table, return null if not
      return null;
    } else {
      for (int i = 0; i < hashArray[indexForRemove].size(); i++) {
        if (hashArray[indexForRemove].get(i).getKey().equals(key)) {
          ValueType removedVal = hashArray[indexForRemove].get(i).getValue();
          hashArray[indexForRemove].remove(i);
          this.size--;
          return removedVal;
        }
      }
    return null;
    }
  }

  /**
   * This method "clears" the hash table by replacing the current underlying array with an empty one
   * of the same capacity.
   */
  @Override
  public void clear() {
    hashArray = new LinkedList[this.capacity]; // replace with brand new LinkedList
    this.size = 0;
  }
/**
 * Private helper method used to hash a key value into an integer value that is a valid index in the
 * underlying array.
 * 
 * @param key to be hashed
 * @return the integer value that the key was hashed to
 */
  private int hashFunction(KeyType key) {
    int hashedIndex = Math.abs(key.hashCode()) % this.capacity;
    return hashedIndex; // use Java Object hashCode method to help generate a hashedIndex
  }
  
  /**
   * Private helper method that doubles the array capacity and rehashes all pairs in the array and
   * inserts them at their new locations. This function is called when the array capacity equals or
   * exceeds a load factor of 80%.
   * 
   */
  private void doubleAndRehashArray() {
    int oldCapacity = this.capacity;
    this.capacity = oldCapacity * 2; // double the capacity for the expanded array
    
    LinkedList<Pair<KeyType, ValueType>>[] newHashArray = new LinkedList[this.capacity];
    
    // rehash each pair in the old hash table and place them in the new hash table
    for (int i = 0; i < oldCapacity; i++) {
      if (hashArray[i] != null) {
        for (int j = 0; j < hashArray[i].size(); j++) {
          Pair<KeyType, ValueType> pairToTransfer = hashArray[i].get(j);
          KeyType key = pairToTransfer.getKey();
          int newIndexToPut = hashFunction(key);
          if (newHashArray[newIndexToPut] == null) {
            LinkedList<Pair<KeyType, ValueType>> newList = new LinkedList<Pair<KeyType,ValueType>>();
            newList.add(pairToTransfer);
            newHashArray[newIndexToPut] = newList;
          } else {
            newHashArray[newIndexToPut].add(pairToTransfer);
            }   
          }
        }
      }
    this.hashArray = newHashArray;
    }
  }