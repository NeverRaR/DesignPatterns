package iterator;

/**
 * @Title: Iterator.java
 *
 * @Package iterator
 *
 * @Description: interface GroupMember, defined two basic operations of the Iterator
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public interface Iterator<T> {

    /**
     * @Description: check whether has next Iteratable object
     *
     * @return: whether has a next Iteratable object
     */
    public boolean hasNext();

    /**
     * @Description: get next Iteratable object
     *
     * @return: whether has a next Iteratable object
     */
    public T next();
}
