package prototype;

import java.io.*;

public class Ticket implements Serializable,Cloneable{
    private double price;//入场券价格
    private String date;//入场券所属日期
    private String type;//入场券所属类型
    public Ticket giftticket;//赠票
    public Ticket(double price,String date,String type){
        this.price=price;
        this.date=date;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    protected Object clone(){
        Ticket ticket = null;
        try {
            ticket = (Ticket)super.clone();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ticket;
    }

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
}
