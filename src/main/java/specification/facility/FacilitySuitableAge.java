package specification.facility;

// https://www.shanghaidisneyresort.com/en/attractions/theme-park/map/

public enum FacilitySuitableAge {
    PRESCHOOLERS(0),
    KIDS(7),
    TWEENS(12),
    TEENS(15),
    ADULT(18);

    private Integer age;

    // getter method
    public Integer getAge()
    {
        return this.age;
    }

    private FacilitySuitableAge(Integer age)
    {
        this.age = age;
    }
}
