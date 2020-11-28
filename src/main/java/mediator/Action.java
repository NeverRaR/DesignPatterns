package mediator;

/**
 * @Title: Action.java
 * 
 * @Package mediator
 * 
 * @Description: All the actions the tour group can do, expressed in enum
 * 
 * @author Jiajie
 * 
 * @date 2020/11/21
 */
public enum Action {
    TOILET("wants to go to the toilet.","is waiting outside the toilet."),
    WANDER("is wandering around in place","is wandering around in place"),
    TOUR("begins Storytelling", "listens attentively"),
    SLED("goes for a dog sled ride", "followed by a dog sled ride");

    private final String proactiveBehavior;
    private final String teamBehavior;

    /**
     * @Description: Construct new Enum action
     *
     * @param proactiveBehavior: the action suggested unsolicitedly
     * @param teamBehavior: the passive actions
     */
    Action(String proactiveBehavior, String teamBehavior) {
        this.proactiveBehavior = proactiveBehavior;
        this.teamBehavior = teamBehavior;
    }

    /**
     * @Description: get corresponding Proactive Behavior
     *
     * @return: corresponding Proactive Behavior
     */
    public String getProactiveBehavior() {
        return proactiveBehavior;
    }

    /**
     * @Description: get corresponding Passive Behavior
     *
     * @return: corresponding Passive Behavior
     */
    public String getTeamBehavior() {
        return teamBehavior;
    }

    /**
     * @Description: get corresponding Proactive Behavior
     *
     * @return: corresponding Passive Behavior
     */
    @Override
    public String toString() {
        return proactiveBehavior;
    }
}
