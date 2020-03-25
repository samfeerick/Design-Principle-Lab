//Name: Samuel Feerick
//Student No: G00319993
//Design Principles Assignment

package ie.gmit.single;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }

    public void Store(User user) {
    }
}