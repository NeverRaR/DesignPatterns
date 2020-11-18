package decorator;

public class BumperCarDecorator extends BaseDecorator {
    BumperCarDecorator(VisitPackage wrappee){
        super(wrappee);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+80;
    }

    @Override
    public String getContent() {
        return super.getContent()+",play the bumper car";
    }
}
