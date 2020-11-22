package iterator;

import java.util.ArrayList;
import java.util.List;

public class TouristInLineIterator implements Iterator<Tourist> {

    private final TouristsInLine line;
    private final TouristType type;
    private int index;

    public TouristInLineIterator(TouristsInLine line, TouristType type) {
        this.line = line;
        this.type = type;
        this.index = -1;
    }

    private int findNextIndex() {
        List<Tourist> tourists = line.getWholeLine();
        int tempIndex = index;
        while (true) {
            tempIndex++;
            if (tempIndex >= tourists.size()) {
                tempIndex = -1;
                break;
            }
            if (tourists.get(tempIndex).getType().equals(type) || type.equals(TouristType.ANY)) {
                break;
            }
        }
        return tempIndex;
    }

    @Override
    public boolean hasNext() {
        return findNextIndex() != -1;
    }

    @Override
    public Tourist next() {
        index = findNextIndex();
        if (index == -1) {
            return null;
        }
        return line.getWholeLine().get(index);
    }
}
