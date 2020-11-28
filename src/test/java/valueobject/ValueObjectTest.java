package valueobject;

import junit.framework.TestCase;
import org.junit.Test;

public class ValueObjectTest extends TestCase {

    /**
     * Create three HeroStats and check equality between those
     */
    @Test
    public void test(){
        HeroStat statA = HeroStat.valueOf(10,5, 0);
        HeroStat statB = HeroStat.valueOf(10, 5 ,0);
        HeroStat statC = HeroStat.valueOf(5, 1, 8);

        System.out.println("(" + this.toString() + ") : " + "StatA: intelligence:" + Integer.toString(statA.getIntelligence()) + " strength:" + Integer.toString(statA.getStrength()) + " luck:" + Integer.toString(statA.getLuck()));
        System.out.println("(" + this.toString() + ") : " + "StatB: intelligence:" + Integer.toString(statB.getIntelligence()) + " strength:" + Integer.toString(statB.getStrength()) + " luck:" + Integer.toString(statB.getLuck()));
        System.out.println("(" + this.toString() + ") : " + "StatC: intelligence:" + Integer.toString(statA.getIntelligence()) + " strength:" + Integer.toString(statA.getStrength()) + " luck:" + Integer.toString(statC.getLuck()));
        System.out.println("(" + this.toString() + ") : " + "Is statA and statB equal : " + Boolean.toString(statA.equals(statB)));
        System.out.println("(" + this.toString() + ") : " + "Is statA and statC equal : " + Boolean.toString(statA.equals(statC)));

    }
}
