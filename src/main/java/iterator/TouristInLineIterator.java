package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: TouristInLineIterator.java
 *
 * @Package iterator
 *
 * @Description: the implementation of Iterator, a line of tourists
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class TouristInLineIterator implements Iterator<Tourist> {

    private final TouristsInLine line;
    private final TouristType type;
    private int index;

    /**
     * @Description: the implementation of Iterator, a line of tourists
     *
     * @param line: the line of tourists
     * @param type: the type to iterate
     */
    public TouristInLineIterator(TouristsInLine line, TouristType type) {
        this.line = line;
        this.type = type;
        this.index = -1;
    }

    /**
     * @Description: get the next tourist of the certain type
     *
     * @return: the index of tourist
     */
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

    /**
     * @Description: check whether there is a Tourist next up in the line
     *
     * @return: whether there is a Tourist next up in the line
     */
    @Override
    public boolean hasNext() {
        return findNextIndex() != -1;
    }

    /**
     * @Description: get the next Tourist in the line
     *
     * @return: the next Tourist in the line
     */
    @Override
    public Tourist next() {
        index = findNextIndex();
        if (index == -1) {
            return null;
        }
        return line.getWholeLine().get(index);
    }
}
