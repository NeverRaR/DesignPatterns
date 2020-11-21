package specification.facility;

/**
 * @author nemo
 */
public class HauntedHouse extends AbstractFacility {

    public HauntedHouse() {
        super(
            "HauntedHouse",
            FacilityType.INDOOR,
            FacilitySuitableAge.TWEENS,
            FacilityThrillLevel.SCARY
        );
    }
}
