package activeobject;

/**
 * @author  NeverRaR
 */
public interface ActiveObject {

    /**
     * 解决投诉
     * @param message
     * 投诉信息
     *
     * @return
     * 解决结果
     */
    Result solveEvent(String message);

    /**
     * 结束主动对象
     */
    void kill();
}
