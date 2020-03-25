//Name: Samuel Feerick
//Student No: G00319993
//Design Principles Assignment

package ie.gmit.single;

public class StoreUser {
    private Store store = new Store();

    public StoreUser (String user){
        //store.Store(user);

    }

    public StoreUser() {
        // default constructor
    }

    public void StoreUser(User user) {
       store.store(user);
        System.out.println("User = "+user );
    }
}
