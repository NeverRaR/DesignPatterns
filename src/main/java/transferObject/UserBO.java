package transferObject;

import java.util.ArrayList;
import java.util.List;

// User business object
public class UserBO {
    private final List<UserVO> users;

    public UserBO() { // use for test case
        UserVO userA = new UserVO("Alex", "0001A7");
        UserVO userB = new UserVO("Kelly", "0004A2");
        users = new ArrayList<>();
        users.add(userA);
        users.add(userB);
    }

    public UserBO(List<UserVO> users) {
        this.users = users;
    } // construct from List

    /*
    * delete user
    * do nothing if user is not in list
    * */
    public void deleteUser(UserVO user) {
        if(!users.contains(user)){
            System.out.println("User: ID "+user.getUserId()+", is not in database");
            return;
        }
        users.remove(user);
        System.out.println("user: [ID: "+user.getUserId()+", Name: "+user.getName()+"] " + "deleted");
    }
    /*
    * add user into list
    * do nothing if user already exists in database
    * */
    public void addUser(UserVO user) {
        if(users.contains(user)){
            System.out.println("User: ID "+user.getUserId()+", is already in database");
            return;
        }
        users.add(user);
        System.out.println("user: [ID: "+user.getUserId()+", Name: "+user.getName()+"] " + "added");
    }

    public List<UserVO> getAllUsers(){
        return users;
    }

    // get user by index
    public UserVO getUser(int index) {
        if(index >= users.size() || index < 0){
            System.out.println("rollNo "+ index + ", is out of range");
        }
        return users.get(index);
    }

    // get user by ID
    public UserVO getUser(String userId){
        for(UserVO user: users){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }


}
