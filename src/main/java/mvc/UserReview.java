package mvc;

public class UserReview {
    private String userId;
    private String review;
    private int stars;

    public UserReview(String userId, String review, int stars) {
        this.userId = userId;
        this.review = review;
        this.stars = stars;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
