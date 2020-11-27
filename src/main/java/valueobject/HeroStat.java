package valueobject;

/**
 * HeroStat is a value object
 */
public class HeroStat {
    private final int strength;
    private final int intelligence;
    private final int luck;

    private HeroStat(int strength, int intelligence, int luck){
        this.strength = strength;
        this.intelligence = intelligence;
        this.luck = luck;
    }

    /**
     * Static factory method to create new instances
     * @param strength strength of hero
     * @param intelligence intelligence of hero
     * @param luck luck of hero
     * @return
     */
    public static HeroStat valueOf(int strength, int intelligence, int luck){
        return new HeroStat(strength, intelligence, luck);
    }

    public int getStrength(){
        return strength;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public int getLuck(){
        return luck;
    }

    @Override
    public String toString(){
        return "HeroStat [strength=" + strength + ", intelligence=" + intelligence
                + ", luck = " + luck + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + intelligence;
        result = prime * result + luck;
        result = prime * result + strength;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        HeroStat other = (HeroStat) obj;
        if(intelligence != other.intelligence){
            return false;
        }
        if(luck != other.luck){
            return false;
        }
        return strength == other.strength;
    }

}
