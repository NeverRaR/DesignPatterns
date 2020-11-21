package specification.facility;

// https://www.shanghaidisneyresort.com/en/attractions/theme-park/map/

/**
 * @author nemo
 */
public enum FacilitySuitableAge {
    PRESCHOOLERS(0),
    KIDS(7),
    TWEENS(12),
    TEENS(15),
    ADULT(18);

    private Integer age;

    /**
     * @return suitable age
     */
    // getter method
    public Integer getAge()
    {
        return this.age;
    }

    /**
     * @param age set age with corresponding enum
     */
    private FacilitySuitableAge(Integer age)
    {
        this.age = age;
    }
}
