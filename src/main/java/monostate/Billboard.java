package monostate;

/**
 * @Title: Billboard.java
 *
 * @Package monostate
 *
 * @Description: the Billboard class, which defines the ops of a billboard
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class Billboard {
    private static String todayNews;

    /**
     *
     * @Description: Constructor, which initialize the todayNews with default value
     */
    Billboard() {
        todayNews = "Welcome to IceParadise!";
    }

    /**
     * @Description: set a new todayNews
     *
     * @param news: the new todayNews
     */
    public void setTodayNews(String news) {
        Billboard.todayNews = news;
    }

    /**
     * @Description: get the current todayNews
     *
     * @return: the current todayNews
     */
    public String getTodayNews() {
        return todayNews;
    }

    /**
     * @Description: throw exception when be cloned
     *
     * @return: a new CloneNotSupportedException
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
