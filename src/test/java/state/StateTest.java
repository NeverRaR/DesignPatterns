package state;

import java.util.Scanner;

public class StateTest {
    public static void main(String[] args) {
        Device device = new Device();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("cur state is: " + device.getState());
            System.out.println("please input command(0:exit 1:use 2:turn on 3: turn off 4: break down 5: fix)");
            try {
                int i = scanner.nextInt();
                boolean isEnd = false;
                switch (i) {
                    case 0: // exit
                        isEnd = true;
                        break;
                    case 1: // Use device
                        device.doUse();
                        break;
                    case 2: // Turn on device
                        device.doOn();
                        break;
                    case 3: // Turn off device
                        device.doOff();
                        break;
                    case 4: // Break down device
                        device.doDown();
                        break;
                    case 5: // fix device
                        device.doFix();
                        break;
                    default:
                        throw new IndexOutOfBoundsException();
                }
                if (isEnd) break;
            }
            catch (Exception e){
                System.out.println("invalid input!");
                break;
            }
        }
    }
}
