package ng.com.uae.kandora.model;

public class FrontPockets {
    FrontPocketsComp frontPocketsComp;
    public FrontPockets(FrontPocketsComp frontPocketsComp)
    {
        this.frontPocketsComp=frontPocketsComp;
    }

    public FrontPocketsComp getFrontPocketsComp() {
        return frontPocketsComp;
    }

    public void setFrontPocketsComp(FrontPocketsComp frontPocketsComp) {
        this.frontPocketsComp = frontPocketsComp;
    }
}
