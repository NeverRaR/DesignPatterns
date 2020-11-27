package specification.facility;

/**
 * @author nemo
 */
public class PirateShip extends AbstractFacility {

    public PirateShip() {
        super(
            "PirateShip",
            FacilityType.OUTDOOR,
            FacilitySuitableAge.KIDS,
            FacilityThrillLevel.THRILLRIDES
        );
    }
}
