package decorator;

/**
 * @author  NeverRaR
 */
public interface VisitPackage {

    /**
     * 获取套餐价格
     * @return
     * 价格
     */
    Double getPrice();

    /**
     * 获取套餐内容
     * @return
     * 内容
     */
    String getContent();
}
