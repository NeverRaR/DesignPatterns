package decorator;

public class BaseDecorator implements VisitPackage {
    private VisitPackage wrappee;
    public BaseDecorator(VisitPackage wrappee) {
        this.wrappee=wrappee;
    }

    public Double getPrice() {
        return wrappee.getPrice();
    }

    public String getContent() {
        return wrappee.getContent();
    }
}
