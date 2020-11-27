package prototype;

import java.io.*;

/**
 * @author 1754025徐菡志
 */

public abstract class TicketCloneable implements Cloneable, Serializable {

    protected double price;
    protected String date;
    protected String type;
    public Ticket giftticket;//complimentary ticket object

    /**
     * Make a shallow copy of itself.
     * @return ticket: the shallow copy of the object.
     */
    @Override
    public Object clone(){
        Ticket ticket = null;
        try {
            ticket = (Ticket)super.clone();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(getClass().getSimpleName()+":("+this.hashCode()+"):clone():make a shallow copy of "+ this.getInfo());

        return ticket;
    }

    /**
     * Make a deep copy of itself.
     * @return ticket: the deep copy of the object.
     */
    public Object deepClone(){

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Ticket copyticket = (Ticket)ois.readObject();
            System.out.println(getClass().getSimpleName()+":("+ this.hashCode()+"):deepclone():make a deep copy of "+ this.getInfo());
            return copyticket;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }

    public abstract String getInfo();

}
