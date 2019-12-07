package ng.com.uae.kandora.model;

public class ItemComponents {

    public ItemComponents(){}

    BackFace backFace;
    ClothType clothType;
    CollarType collarType;
    CuffType cuffType;
    FrontFace frontFace;
    FrontPockets frontPockets;
    KandoraType kandoraType;
    Stitching stitching;

    public ItemComponents(BackFace backFace,ClothType clothType,CollarType collarType,CuffType cuffType,FrontFace frontFace,FrontPockets frontPockets,KandoraType kandoraType,Stitching stitching)
    {
        this.backFace=backFace;
        this.clothType = clothType;
        this.collarType = collarType;
        this.cuffType = cuffType;
        this.frontFace = frontFace;
        this.frontPockets = frontPockets;
        this.kandoraType=kandoraType;
        this.stitching=stitching;
    }

    public BackFace getBackFace() {
        return backFace;
    }

    public void setBackFace(BackFace backFace) {
        this.backFace = backFace;
    }

    public ClothType getClothType() {
        return clothType;
    }

    public void setClothType(ClothType clothType) {
        this.clothType = clothType;
    }

    public CollarType getCollarType() {
        return collarType;
    }

    public void setCollarType(CollarType collarType) {
        this.collarType = collarType;
    }

    public CuffType getCuffType() {
        return cuffType;
    }

    public void setCuffType(CuffType cuffType) {
        this.cuffType = cuffType;
    }

    public FrontFace getFrontFace() {
        return frontFace;
    }

    public void setFrontFace(FrontFace frontFace) {
        this.frontFace = frontFace;
    }

    public FrontPockets getFrontPockets() {
        return frontPockets;
    }

    public void setFrontPockets(FrontPockets frontPockets) {
        this.frontPockets = frontPockets;
    }

    public KandoraType getKandoraType() {
        return kandoraType;
    }

    public void setKandoraType(KandoraType kandoraType) {
        this.kandoraType = kandoraType;
    }

    public Stitching getStitching() {
        return stitching;
    }

    public void setStitching(Stitching stitching) {
        this.stitching = stitching;
    }

}
