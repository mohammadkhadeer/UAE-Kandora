package ng.com.uae.kandora.model;

import java.util.ArrayList;

public class PeopleComment {
    //this model just to be remainder on the future
    public ArrayList<PeopleCommentsDetails> peopleCommentsDetailsArrayL ;
    public PeopleComment(){}
    public  PeopleComment(ArrayList<PeopleCommentsDetails> peopleCommentsDetailsArrayL)
    {
        this.peopleCommentsDetailsArrayL=peopleCommentsDetailsArrayL;
    }

    public ArrayList<PeopleCommentsDetails> getPeopleCommentsDetailsArrayL() {
        return peopleCommentsDetailsArrayL;
    }

    public void setPeopleCommentsDetailsArrayL(ArrayList<PeopleCommentsDetails> peopleCommentsDetailsArrayL) {
        this.peopleCommentsDetailsArrayL = peopleCommentsDetailsArrayL;
    }
}
