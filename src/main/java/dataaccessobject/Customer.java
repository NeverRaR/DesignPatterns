package dataaccessobject;

import java.io.Serializable;

/**
 * Customer
 */
public class Customer implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    /**
     * Constructor
     * @param id customer id
     * @param firstName first name of the customer
     * @param lastName last name of the customer
     */
    public Customer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get customer id
     * @return customer id
     */

    public int getID(){
        return this.id;
    }

    /**
     * Get first name of the customer
     * @return first name of the customer
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Get last name of the customer
     * @return last name of the customer
     */
    public String getLastName(){
        return this.lastName;
    }


}
