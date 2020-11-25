package frontcontroller;

/**
 * Class FrontController to authorize and dispatch view
 */
public class FrontController {
    private PlayerDispatcher playerDispatcher;

    public FrontController(){
        playerDispatcher = new PlayerDispatcher();
    }

    /**
     * Check if the given id is authorized
     * @param id given player's id
     * @return true if the id is authorized
     */
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

    /**
     * Dispatch view according to id and request message
     * @param request request message
     * @param id player's id
     */
    public void dispatchRequest(String request, String id){

        trackRequest(request);

        if(isAuthenticPlayer(id)){
            playerDispatcher.dispatch(request);
        }
    }

}
