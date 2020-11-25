package singleton;

/**
 * @Title: Clock.java
 *
 * @Package singleton
 *
 * @Description: the Clock class, which defines the ops and attrs of a Clock
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class Clock {
    private volatile static Clock clock;

    /**
     *
     * @Description: Constructor, which initialize the time with default value
     */
    private Clock() {
        time = "Loading...";
    };

    /**
     * @Description: use double-checked locking to ensure the singleton
     * volatile guarantees that the code will be correct even if the
     * java virtual machine performs instruction reordering on it.
     *
     * @return: the static Clock
     */
    public static Clock getClock() {
        if (clock == null) {
            synchronized (Clock.class) {
                if (clock == null) {
                    clock = new Clock();
                }
            }
        }
        return clock;
    }

    private String time;

    /**
     * @Description: set the current time
     *
     * @param currentTime: the current time
     */
    public void setTime(String currentTime) {
        time = currentTime;
    }

    /**
     * @Description: get the current time
     *
     * @return: the current time
     */
    public String getTime() {
        return time;
    }
}
