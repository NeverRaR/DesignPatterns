package specification;

import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import java.util.stream.Collectors;

import specification.facility.*;
import specification.selector.*;

public class SpecificationTest {
    @Test
    public void main() {
        System.out.println("Test specification:");
        System.out.println("Initializing facilities...");
        List<Facility> facilityList = new ArrayList<>();
        facilityList.add(new RollerCaster());
        facilityList.add(new MerryGoRound());
        facilityList.add(new HauntedHouse());
        facilityList.add(new PirateShip());
        facilityList.add(new RoaringRapids());
        facilityList.add(new MadHatterTeaCups());
        System.out.println("All facilities:");
        facilityList.forEach((facility) -> System.out.println(facility.getName() + " " + facility.getFacilityType() + " " + facility.getFacilitySuitableAge() + " " + facility.getFacilityThrillLevel()));
        System.out.println("Sorting out facilities which is OUTDOOR...");
        List<Facility> outdoorFacilityList = facilityList.stream().filter(new FacilityTypeSelector(FacilityType.OUTDOOR)).collect(Collectors.toList());
        System.out.println("OUTDOOR facilities:");
        outdoorFacilityList.forEach((facility) -> System.out.println(facility.getName() + " " + facility.getFacilityType()));
        System.out.println("Sorting out facilities which is SCARY...");
        List<Facility> scaryFacilityList = facilityList.stream().filter(new FacilityThrillLevelSelector(FacilityThrillLevel.SCARY)).collect(Collectors.toList());
        System.out.println("SCARY facilities:");
        scaryFacilityList.forEach((facility) -> System.out.println(facility.getName() + " " + facility.getFacilityThrillLevel()));
        System.out.println("Sorting out facilities which is OUTDOOR and suitable for KIDS...");
        List<Facility> ourdoorTweenFacilityList = facilityList.stream().filter(new FacilityTypeSelector(FacilityType.OUTDOOR)).filter(new FacilitySuitableAgeSelector(FacilitySuitableAge.KIDS)).collect(Collectors.toList());
        System.out.println("OUTDOOR and suitable for KIDS facilities:");
        ourdoorTweenFacilityList.forEach((facility) -> System.out.println(facility.getName() + " " + facility.getFacilityType() + " " + facility.getFacilitySuitableAge()));
    }
}

