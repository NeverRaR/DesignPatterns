package decorator;

/**
 * @author  NeverRaR
 */
public class Ticket implements VisitPackage {
    private Double price=50.0;
    private String content="Enter the paradise";
    public Ticket() {

    }

    public Ticket(Double price,String content) {
        this.price=price;
        this.content=content;
    }

    public Double getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }
}
