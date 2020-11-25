package decorator;

/**
 * @author  NeverRaR
 */
public class IceSculptureExhibitionDecorator extends BaseDecorator {
    public  IceSculptureExhibitionDecorator(VisitPackage wrappee){
        super(wrappee);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+100;
    }

    @Override
    public String getContent() {
        return super.getContent()+",visit the ice sculpture exhibition";
    }
}
