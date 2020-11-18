package decorator;

public class RollerCoasterDecorator extends BaseDecorator {
    public  RollerCoasterDecorator(VisitPackage wrappee){
        super(wrappee);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+200;
    }

    @Override
    public String getContent() {
        return super.getContent()+",play the roller coaster";
    }
}
