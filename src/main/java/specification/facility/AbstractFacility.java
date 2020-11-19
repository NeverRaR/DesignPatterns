package specification.facility;

    public abstract class AbstractFacility implement Facility {

        private final String name;
        private final FacilityType type;
        private final FacilitySuitableAge minSuitableAge;
        private final FacilityThrillLevel thrillLevel;

        /**
         * Constructor.
         */
        public AbstractFacility(String name, FacilityType type, FacilitySuitableAge minSuitableAge, FacilityThrillLevel thrillLevel) {
            this.name = name;
            this.type = type;
            this.minSuitableAge = minSuitableAge;
            this.thrillLevel = thrillLevel;
        }

        @Override
        public String toString() {
            return String.format("%s [FacilityType = %s, FacilitySuitableAge = %s, FacilityThrillLevel = %s]",
                    name, type, minSuitableAge, thrillLevel);
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public FacilityType getFacilityType() {
            return type;
        }

        @Override
        public FacilitySuitableAge getFacilitySuitableAge() {
            return minSuitableAge;
        }

        @Override
        public FacilityThrillLevel getFacilityThrillLevel() {
            return thrillLevel;
        }

    }
