package mvc;

public class UserReviewController {
    private UserReview model;
    private UserReviewView view;

    public UserReviewController(UserReview model, UserReviewView view) {
        this.model = model;
        this.view = view;
    }

    public String getUserId() {
        return model.getUserId();
    }

    public void setUserId(String userId) {
        model.setUserId(userId);
    }

    public String getReview() {
        return model.getReview();
    }

    public void setReview(String review) {
        model.setReview(review);
    }

    public int getStars() {
        return model.getStars();
    }

    public void setStars(int stars) {
        model.setStars(stars);
    }

    public void updateView(){
        view.displayModel(model);
    }
}
