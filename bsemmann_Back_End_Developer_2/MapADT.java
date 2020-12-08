// --== CS400 File Header Information ==--
// Name: Adam Tupitza
// Email: tupitza@wisc.edu
// Team: FF
// Role: Data Wrangler 1
// TA: Abhay Kumar
// Lecturer: Gary Dahl
// Notes to Grader: n/a
import java.util.NoSuchElementException;

public interface MapADT<KeyType,ValueType> {
    public boolean put(KeyType key, ValueType value);
    public ValueType get(KeyType key) throws NoSuchElementException;
    public int size();
    public boolean containsKey(KeyType key);
    public ValueType remove(KeyType key);
    public void clear();
}