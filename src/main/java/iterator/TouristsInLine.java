package iterator;

import java.util.ArrayList;
import java.util.List;

public class TouristsInLine {

    private final List<Tourist> line;

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

    public TouristInLineIterator  iterator(TouristType touristType) {
        return new TouristInLineIterator(this, touristType);
    }

    public List<Tourist> getWholeLine() {
        return new ArrayList<>(line);
    }

    public void clear() {
        line.clear();
    }

    public void append(TouristType touristType, String name) {
        Tourist tourist = new Tourist(touristType, name);
        line.add(tourist);
    }

    public int size() {
        return line.size();
    }
}
