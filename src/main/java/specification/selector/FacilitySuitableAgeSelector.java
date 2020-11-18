package specification.selector;

import specification.facility.Facility;
import specification.facility.FacilitySuitableAge;

public class FacilitySuitableAgeSelector extends AbstractSelector<Facility> {

    private final FacilitySuitableAge suitableAge;

    public FacilitySuitableAgeSelector(FacilitySuitableAge m) {
        this.suitableAge = m;
    }

    @Override
    public boolean test(Facility t) {
        return (t.getFacilitySuitableAge().getAge() <= (suitableAge.getAge()));
    }
}
