package ng.com.uae.kandora.model;

public class Rate {
    String rateAvg,rateNum;
    public Rate(String rateAvg,String rateNum)
    {
        this.rateAvg=rateAvg;
        this.rateNum=rateNum;
    }

    public String getRateAvg() {
        return rateAvg;
    }

    public void setRateAvg(String rateAvg) {
        this.rateAvg = rateAvg;
    }

    public String getRateNum() {
        return rateNum;
    }

    public void setRateNum(String rateNum) {
        this.rateNum = rateNum;
    }
}
