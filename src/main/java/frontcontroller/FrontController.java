package frontcontroller;

public class FrontController {
    private PlayerDispatcher playerDispatcher;

    public FrontController(){
        playerDispatcher = new PlayerDispatcher();
    }

    private boolean isAuthenticPlayer(String id){
        if(id.equalsIgnoreCase("Admin")) {
            System.out.println("FrontController:isAuthenticPlayer(" + this.toString() + "):This Player is authenticated successfully!");
            return true;
        } else {
            System.out.println("FrontController:isAuthenticPlayer(" + this.toString() + "):This Player is not authenticated successfully!");
            return false;
        }
    }

    private void trackRequest(String request){
        System.out.println("FrontController:trackRequest(" + this.toString() + "):Page requested: " + request);
    }

    public void dispatchRequest(String request, String id){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticPlayer(id)){
            playerDispatcher.dispatch(request);
        }
    }

}
