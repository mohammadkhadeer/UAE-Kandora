package ng.com.uae.kandora.model;

public class Offer {
    String newPrice,offerExpiry,offerOrNot,specialOffer;
    SpecialOfferDes specialOfferDes;

    public Offer(){}
    public Offer(String newPrice,String offerExpiry,String offerOrNot,String specialOffer,SpecialOfferDes specialOfferDes)
    {
        this.newPrice = newPrice;
        this.offerExpiry = offerExpiry;
        this.offerOrNot = offerOrNot;
        this.specialOffer = specialOffer;
        this.specialOfferDes = specialOfferDes;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getOfferExpiry() {
        return offerExpiry;
    }

    public void setOfferExpiry(String offerExpiry) {
        this.offerExpiry = offerExpiry;
    }

    public String getOfferOrNot() {
        return offerOrNot;
    }

    public void setOfferOrNot(String offerOrNot) {
        this.offerOrNot = offerOrNot;
    }

    public String getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(String specialOffer) {
        this.specialOffer = specialOffer;
    }

    public SpecialOfferDes getSpecialOfferDes() {
        return specialOfferDes;
    }

    public void setSpecialOfferDes(SpecialOfferDes specialOfferDes) {
        this.specialOfferDes = specialOfferDes;
    }
}
