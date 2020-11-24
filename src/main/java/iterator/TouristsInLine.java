package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: TouristsInLine.java
 *
 * @Package iterator
 *
 * @Description: the Tourists in the line, initialized with a line of certain tourists
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class TouristsInLine {

    private final List<Tourist> line;

    /**
     *
     * @Description: Constructor
     */
    public  TouristsInLine() {
        line = new ArrayList<Tourist>() {{
            add(new Tourist(TouristType.ADULTS, "Jack"));
            add(new Tourist(TouristType.CHILDREN, "Peter"));
            add(new Tourist(TouristType.MILITARY, "Judy"));
            add(new Tourist(TouristType.ELDERLY, "Alice"));
            add(new Tourist(TouristType.ADULTS, "Lindsay"));
            add(new Tourist(TouristType.CHILDREN, "Victoria"));
            add(new Tourist(TouristType.MILITARY, "Ella"));
            add(new Tourist(TouristType.ELDERLY, "Ruby"));
            add(new Tourist(TouristType.ADULTS, "Nana"));
            add(new Tourist(TouristType.CHILDREN, "Delia"));
            add(new Tourist(TouristType.MILITARY, "Lisa"));
            add(new Tourist(TouristType.ELDERLY, "Winifred"));
            add(new Tourist(TouristType.ADULTS, "Teresa"));
            add(new Tourist(TouristType.CHILDREN, "Lorraine"));
            add(new Tourist(TouristType.ADULTS, "Crystal"));
            add(new Tourist(TouristType.ADULTS, "June"));
        }};
    }

    /**
     * @Description: get a new TouristInLineIterator instance of a certain type
     *
     * @param touristType: the tourist type to search
     * @return: a new TouristInLineIterator instance of a certain type
     */
    public TouristInLineIterator  iterator(TouristType touristType) {
        return new TouristInLineIterator(this, touristType);
    }

    /**
     * @Description: get the whole line
     *
     * @return: the whole line of tourists in an ArrayList format
     */
    public List<Tourist> getWholeLine() {
        return new ArrayList<>(line);
    }

    /**
     * @Description: Clear up the whole line
     *
     */
    public void clear() {
        line.clear();
    }

    /**
     * @Description: append a new tourist to the line
     *
     * @param touristType: the type of the newcomer
     * @param name: the name of the newcomer
     */
    public void append(TouristType touristType, String name) {
        Tourist tourist = new Tourist(touristType, name);
        line.add(tourist);
    }

    /**
     * @Description: get the size of the current line
     *
     * @return: the size of the current line
     */
    public int size() {
        return line.size();
    }
}
