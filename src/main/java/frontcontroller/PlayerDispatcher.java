package frontcontroller;

/**
 * Class to dispatch views according to given request
 */
public class PlayerDispatcher {
    private PlayerView playerView;
    private HomeView homeView;

    public PlayerDispatcher(){
        playerView = new PlayerView();
        homeView = new HomeView();
    }

    /**
     * Dispatch view according to given request
     * @param request request view
     */
    public void dispatch(String request){
        if(request.equalsIgnoreCase("PLAYER")){
            playerView.show();;
        }else{
            homeView.show();
        }
    }

}
