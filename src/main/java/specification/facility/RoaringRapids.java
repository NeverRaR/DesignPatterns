package specification.facility;

// https://www.shanghaidisneyresort.com/en/attractions/roaring-rapids/

/**
 * @author nemo
 */
public class RoaringRapids extends AbstractFacility {

    public RoaringRapids() {
        super(
            "RoaringRapids",
            FacilityType.OUTDOOR,
            FacilitySuitableAge.KIDS,
            FacilityThrillLevel.WATERRIDES
        );
    }
}
