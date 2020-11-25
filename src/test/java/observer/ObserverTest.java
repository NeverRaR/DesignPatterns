package observer;

import org.junit.Test;

/**
 * Test for observer
 * @author Nntraveler
 */
public class ObserverTest {
    @Test
    public void main(){
        // create observable peopleNum
        PeopleNum peopleNum = new PeopleNum();
        // create observers
        NumScreen numScreen = new NumScreen(peopleNum);
        EntranceEmployee entranceEmployee = new EntranceEmployee(peopleNum);
        // update peopleNum and observers
        peopleNum.setVal(80);
        peopleNum.setVal(105);
        peopleNum.deleteObserver(entranceEmployee);
        EntranceEmployee entranceEmployee2 = new EntranceEmployee(peopleNum, 200);
        peopleNum.setVal(90);
        peopleNum.setVal(120);
        peopleNum.setVal(210);
    }
}
