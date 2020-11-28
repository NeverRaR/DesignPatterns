package mvc;

import junit.framework.TestCase;
import org.junit.Test;

public class MvcTest extends TestCase {
    @Test
    public void test(){
        UserReview model = retrieveReviewFromDatabase();
        UserReviewView view = new UserReviewView();
        UserReviewController controller = new UserReviewController(model, view);
        controller.updateView();
        controller.setUserId("0B1A4");
        controller.setStars(2);
        controller.setReview("Terrible!");
        controller.updateView();
    }

    private static UserReview retrieveReviewFromDatabase(){
        return new UserReview("0E1B2", "Pretty good job so far.", 5);
    }
}
