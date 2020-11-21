package objectmother;

public class ElectronicFacilities implements Facilities{

    private boolean isDamaged = false;
    private boolean isClosed = false;
    private boolean isPowered = true;

    @Override
    public void makeDameged() {
        isDamaged = true;
    }

    @Override
    public void makeRepaired() {
        isDamaged = false;
    }

    @Override
    public void makeOpen() {
        isClosed = false;
    }

    @Override
    public void makeClosed() {
        isClosed = true;
    }

    public void makePowerOn() {
        isPowered = true;
    }

    public void makePowerOff() {
        isPowered = false;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public boolean isPowered() {
        return isPowered;
    }

    public void enter() {
        if (isClosed) {
            System.out.println("This facility is now malfunctioning and is really under repair!");
        }
        else {
            System.out.println("Enter to play happily in the facility!");
        }
    }
}
