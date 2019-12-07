package ng.com.uae.kandora.model;

public class PeopleCommentsDetails {
    String userName,userComment,userImage;
    public PeopleCommentsDetails (String userName,String userComment,String userImage)
    {
        this.userName = userName;
        this.userComment=userComment;
        this.userImage=userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }
}
