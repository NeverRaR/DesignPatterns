package transferObject;

// User value object
public class UserVO {
    private String name;
    private String UserId;

    public UserVO(String name, String userId) {
        this.name = name;
        UserId = userId;
    }

    public UserVO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
