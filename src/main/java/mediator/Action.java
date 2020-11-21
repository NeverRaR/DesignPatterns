package mediator;

public enum Action {
    TOILET("wants to go to the toilet.","is waiting outside the toilet."),
    WANDER("is wandering around in place","is wandering around in place"),
    TOUR("begins Storytelling", "listens attentively"),
    SLED("goes for a dog sled ride", "followed by a dog sled ride");

    private final String proactiveBehavior;
    private final String teamBehavior;

    Action(String proactiveBehavior, String teamBehavior) {
        this.proactiveBehavior = proactiveBehavior;
        this.teamBehavior = teamBehavior;
    }

    public String getProactiveBehavior() {
        return proactiveBehavior;
    }

    public String getTeamBehavior() {
        return teamBehavior;
    }


    @Override
    public String toString() {
        return proactiveBehavior;
    }
}
