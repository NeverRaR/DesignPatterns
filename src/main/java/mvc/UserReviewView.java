package mvc;

public class UserReviewView {

    public UserReviewView() { }

    public void displayModel(UserReview userReview){
        System.out.println("[UserReviewView:"+ toString() +":displayModel]: userReview");
        System.out.println(" userId: " + userReview.getUserId() + ",");
        System.out.println(" stars: " + userReview.getStars() + ",");
        System.out.println(" review: " + userReview.getReview());
    }

}
