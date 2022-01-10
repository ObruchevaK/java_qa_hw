package ua.com.alevel.HW3.db;

import ua.com.alevel.HW3.entity.Child;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DBInMemory {
    private final List<Child> children = new ArrayList<>();
    private final static DBInMemory instance = new DBInMemory();

    private DBInMemory() { }

    public static DBInMemory getInstance() {
        return instance;
    }

    public void insert(Child child) {
        child.setId(generateId());
        children.add(child);
    }

    public Child selectById(String id) {
        for (Child child : children) {
            if (child.getId().equals(id)) {
                return child;
            }
        }
        return null;
    }

    public List<Child> selectAll() {
        return children;
    }

    public void delete(String id) {
        children.removeIf(customer -> customer.getId().equals(id));
    }

    public void update(Child child) {
        for (Child current : children) {
            if (current.getId().equals(child.getId())) {
                current = child;
            }
        }
    }

    public boolean existByEmail(String email) {
        for (Child child : children) {
            if (child.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    private String generateId() {
        String id = UUID.randomUUID().toString();
        for (Child child : children) {
            if (child.getId().equals(id)) {
                return generateId();
            }
        }
        return id;
    }
}
