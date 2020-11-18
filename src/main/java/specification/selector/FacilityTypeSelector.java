package specification.selector;

import specification.facility.Facility;
import specification.facility.FacilityType;

public class FacilityTypeSelector extends AbstractSelector<Facility> {

    private final FacilityType type;

    public FacilityTypeSelector(FacilityType m) {
        this.type = m;
    }

    @Override
    public boolean test(Facility t) {
        return t.getFacilityType().equals(type);
    }
}
