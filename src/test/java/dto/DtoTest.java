package dto;

import org.junit.Test;

public class DtoTest {
    @Test
    /**
     * Get new tools.
     */
    public void test(){
        Tools skiBoard = new Tools();
        skiBoard.name = "skiboard";
        skiBoard.price = "100";
        Tools skiBoots = new Tools();
        skiBoots.name = "skiBoots";
        skiBoots.price = "200";
        Preprocessing preprocessingLine = new Preprocessing();
        Skier Skier = new Skier();
        preprocessingLine.establishPipe(Skier);
        preprocessingLine.preprocess("skierA", skiBoard, skiBoots);
    }
}
