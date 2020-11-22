package singleton;

public class Clock {
    private volatile static Clock clock;

    private Clock() {
        time = "Loading...";
    };

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

    public void setTime(String currentTime) {
        time = currentTime;
    }

    public String getTime() {
        return time;
    }
}
