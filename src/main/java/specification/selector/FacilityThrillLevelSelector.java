package specification.selector;

import specification.facility.Facility;
import specification.facility.FacilityThrillLevel;

public class FacilityThrillLevelSelector extends AbstractSelector<Facility> {

private final FacilityThrillLevel thrillLevel;

public FacilityThrillLevelSelector(FacilityThrillLevel m) {
        this.thrillLevel = m;
        }

@Override
public boolean test(Facility t) {
        return t.getFacilityThrillLevel().equals(thrillLevel);
        }
}