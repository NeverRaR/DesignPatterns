package transferObject;

/**
 * The type User value object
 */
public class UserVO {
    private String name;
    private String UserId;

    /**
     * Instantiates a new User vo.
     *
     * @param name   the name
     * @param userId the user id
     */
    public UserVO(String name, String userId) {
        this.name = name;
        UserId = userId;
    }

    /**
     * Instantiates a new User vo.
     */
    public UserVO() {
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return UserId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
        UserId = userId;
    }
}
