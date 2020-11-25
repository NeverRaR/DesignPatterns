package transferObject;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User business object
 */

public class UserBO {
    private final List<UserVO> users;

    /**
     * Instantiates a new User bo.
     * use for test case
     */
    public UserBO() {
        UserVO userA = new UserVO("Alex", "0001A7");
        UserVO userB = new UserVO("Kelly", "0004A2");
        users = new ArrayList<>();
        users.add(userA);
        users.add(userB);
    }

    /**
     * Instantiates a new User bo.
     *
     * @param users the list of UserVo
     */
    public UserBO(List<UserVO> users) {
        this.users = users;
    } // construct from List

    /**
     * Delete user.
     * do nothing if user is not in list
     *
     * @param user the user
     */
    public void deleteUser(UserVO user) {
        if(!users.contains(user)){
            System.out.println("[UserBO:" +toString()+ ":deleteUser]: User: ID "+user.getUserId()+", is not in database");
            return;
        }
        users.remove(user);
        System.out.println("[UserBO:" +toString()+ ":deleteUser]: user: [ID: "+user.getUserId()+", Name: "+user.getName()+"] " + "deleted");
    }

    /**
     * Add user.
     * do nothing if user already exists in database
     *
     * @param user the user
     */
    public void addUser(UserVO user) {
        if(users.contains(user)){
            System.out.println("[UserBO:" +toString()+ ":addUser]: User: ID "+user.getUserId()+", is already in database");
            return;
        }
        users.add(user);
        System.out.println("[UserBO:" +toString()+ ":addUser]: user: [ID: "+user.getUserId()+", Name: "+user.getName()+"] " + "added");
    }

    /**
     * Get all users list.
     *
     * @return the list
     */
    public List<UserVO> getAllUsers(){
        return users;
    }

    /**
     * Gets user.
     *
     * @param index the index
     * @return the user
     */
    public UserVO getUser(int index) {
        if(index >= users.size() || index < 0){
            System.out.println("[UserBO:" +toString()+ ":getUser]: rollNo "+ index + ", is out of range");
        }
        return users.get(index);
    }

    /**
     * Gets user.
     *
     * @param userId the user id
     * @return the user vo
     */
    public UserVO getUser(String userId){
        for(UserVO user: users){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }


}
