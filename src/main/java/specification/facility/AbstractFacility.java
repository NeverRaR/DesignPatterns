package specification.facility;

/**
 * @author nemo
 */
public abstract class AbstractFacility implements Facility {

    private final String name;
    private final FacilityType type;
    private final FacilitySuitableAge minSuitableAge;
    private final FacilityThrillLevel thrillLevel;

    /**
     * Constructor.
     */
    public AbstractFacility(
        String name,
        FacilityType type,
        FacilitySuitableAge minSuitableAge,
        FacilityThrillLevel thrillLevel
    ) {
        this.name = name;
        this.type = type;
        this.minSuitableAge = minSuitableAge;
        this.thrillLevel = thrillLevel;
    }

    /**
     * @return String: facility stats
     */
    @Override
    public String toString() {
        return String.format(
            "%s [FacilityType = %s, FacilitySuitableAge = %s, FacilityThrillLevel = %s]",
            name,
            type,
            minSuitableAge,
            thrillLevel
        );
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    @Override
    public FacilityType getFacilityType() {
        return type;
    }

    /**
     * @return
     */
    @Override
    public FacilitySuitableAge getFacilitySuitableAge() {
        return minSuitableAge;
    }

    /**
     * @return
     */
    @Override
    public FacilityThrillLevel getFacilityThrillLevel() {
        return thrillLevel;
    }
}
