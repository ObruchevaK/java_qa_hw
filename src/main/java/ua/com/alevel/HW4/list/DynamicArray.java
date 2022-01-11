package ua.com.alevel.HW4.list;
import java.util.Iterator;

public interface DynamicArray {
    void add(Object o);
    Object get(int i);
    void set(int i, Object o);
    void delete(int i);
    Object[] findAll();

    Iterator<Integer> iterator();
}
