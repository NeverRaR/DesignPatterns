package dataaccessobject;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    public Customer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }


}
