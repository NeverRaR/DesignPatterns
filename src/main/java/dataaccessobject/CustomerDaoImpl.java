package dataaccessobject;

import java.io.*;
import java.util.Base64;

/**
 * Implementation of the CustomerDao interface
 */
public class CustomerDaoImpl implements CustomerDao{

    private String filePath = new String("./Customer.dat");

    /**
     * get customer information from file system
     * @return Customer
     */
    @Override
    public Customer getCustomer() {
        try{
            FileInputStream in = new FileInputStream(filePath);
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            String str = new String(buffer, "UTF-8");
            Customer cus = (Customer)fromString(str);
            System.out.println("("+this.toString()+") : "+"Get customer data from local file system");
            return cus;
        } catch (ClassNotFoundException|IOException e) {
            return null;
        }

    }

    /**
     * update customer information to given file
     * @param customer the given customer information
     * @return
     */
    @Override
    public boolean updateCustomer(Customer customer) {
        try {
            String str=toString((Serializable) customer);
            FileOutputStream fileOut = new FileOutputStream(filePath);
            fileOut.write(str.getBytes());
            fileOut.close();
            System.out.println("("+ this.toString() + ") : " + "Customer data is saved to local file system");
        } catch (IOException e) {
            return false;
        }
        return true;
    }


    private  Object fromString( String s) throws IOException, ClassNotFoundException {
        byte [] data = Base64.getDecoder().decode( s );
        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(  data ) );
        Object o  = ois.readObject();
        ois.close();
        return o;
    }

    private String toString( Serializable o ) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream( baos );
        oos.writeObject( o );
        oos.close();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }

}
