package futurepromise;

class Dishes {
    public String name;
    public int price;

    public Dishes(String n, int p) {
        this.price = p;
        this.name = n;
    }
}

public class RealOrder implements Order {
    private final Dishes dishes;

    public RealOrder(Dishes d) {
        System.out.println("Cook: Begin to make " + d.name);
        try {
            System.out.println("Cook: The dishes " + d.name + " is making ....");
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cook: The dishes " + d.name + " is Done");
        this.dishes = d;
    }

    @Override
    public Dishes getDishes() {
        return dishes;
    }

}
