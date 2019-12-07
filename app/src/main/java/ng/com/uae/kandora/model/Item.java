package ng.com.uae.kandora.model;

public class Item {
    String tax,cat,categoryID,itemID;
    Description description;
    ImagePath imagePath;
    ItemComponents itemComponents;
    Name name;
    Offer offer;
    //PeopleComment peopleComment;
    int price;
    Rate rate;
    public Item (String tax,String cat,String categoryID,Description description,ImagePath imagePath,ItemComponents itemComponents,String itemID,Name name,Offer offer,int price,Rate rate)
    {
        this.tax=tax;
        this.cat=cat;
        this.categoryID = categoryID;
        this.imagePath = imagePath;
        this.itemComponents = itemComponents;
        this.itemID=itemID;
        this.name=name;
        this.offer=offer;
        this.price = price;
        this.rate = rate;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public ImagePath getImagePath() {
        return imagePath;
    }

    public void setImagePath(ImagePath imagePath) {
        this.imagePath = imagePath;
    }

    public ItemComponents getItemComponents() {
        return itemComponents;
    }

    public void setItemComponents(ItemComponents itemComponents) {
        this.itemComponents = itemComponents;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }
}
