package ng.com.uae.kandora.model;

public class PeopleComment {
    //this model just to be remainder on the future
    String userName,userComment;
    public PeopleComment(String userName,String userComment)
    {
        this.userName = userName;
        this.userComment = userComment;
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
}
