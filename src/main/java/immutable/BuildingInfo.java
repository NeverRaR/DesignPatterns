package immutable;

class Building {
    private String name;
    private String location;

    public Building(String n, String l) {
        this.location = l;
        this.name = n;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name:" + name + ", location:" + location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public final class BuildingInfo {
    private final Building building;
    private final int buildingID;

    public BuildingInfo(Building b, int id) {
        this.building = new Building(b.getName(), b.getLocation());
        this.buildingID = id;
    }

    public final int getBuildingID() {
        return buildingID;
    }

    public final Building getBuilding() {
        return building;
    }

    public String toString() {
        return "id:" + buildingID + ",Info:" + building;
    }
}
