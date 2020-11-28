package iterator;

/**
 * @Title: Tourist.java
 * 
 * @Package iterator
 * 
 * @Description: TODO
 * 
 * @author Jiajie
 * 
 * @date 2020/11/24
 */
public class Tourist {

    private TouristType type;
    private final String name;

    /**
     * @Description: Constructors
     *
     * @param type: Tourist's Type
     * @param name: Tourist's name
     */
    public Tourist(TouristType type, String name) {
        this.name  = name;
        this.type = type;
    }

    /**
     * @Description: Override the toString()
     *
     * @return: the tourist's name
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * @Description: Override the toString()
     *
     * @return: Tourist's type
     */
    public TouristType getType() {
        return type;
    }

    /**
     * @Description: set Tourist's type
     *
     * @param type: Tourist's type
     */
    public final void setType(TouristType type) {
        this.type = type;
    }
}
