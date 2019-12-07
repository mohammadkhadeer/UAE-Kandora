package ng.com.uae.kandora.model;

public class Item {
    String tax,cat,categoryID,itemID;
    Description description;
    ImagePath imagePath;
    ItemComponents itemComponents;
    Name name;
    Offer offer;
    PeopleComment peopleComment;
    int price;
    Rate rate;
    public Item (String tax,String cat,String categoryID,Description description,ImagePath imagePath,ItemComponents itemComponents,String itemID,Name name,Offer offer,PeopleComment peopleComment,int price,Rate rate)
    {
        this.tax=tax;
        this.cat=cat;
        this.categoryID = categoryID;
        this.imagePath = imagePath;
        this.itemComponents = itemComponents;
        this.itemID=itemID;
        this.name=name;
        this.offer=offer;
        this.peopleComment=peopleComment;
        this.price = price;
        this.rate = rate;
    }
}
