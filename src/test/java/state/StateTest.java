package state;

import org.junit.Test;

import java.util.Scanner;

/**
 * Test for state
 * @author Nntraveler
 */
public class StateTest {

    @Test
    public void main() {
        // Instantiates
        Device device = new Device();
        System.out.println("[StateTest:main]: cur state is: " + device.getState());
        // off state
        device.doUse();
        device.doOn();
        // on state
        device.doUse();
        device.doOff();
        // off state
        device.doDown();
        // error state
        device.doUse();
        device.doFix();
        // off state
        device.doOn();
        device.doUse();

    }
}
