package monostate;

public class Billboard {
    private static String todayNews;

    Billboard() {
        todayNews = "Welcome to IceParadise!";
    }

    public void setTodayNews(String news) {
        Billboard.todayNews = news;
    }

    public String getTodayNews() {
        return todayNews;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
