package ng.com.uae.kandora.model;

public class Description {
    String arabicDes,englishDes;
    public Description (String arabicDes,String englishDes)
    {
        this.arabicDes = arabicDes;
        this.englishDes = englishDes;
    }

    public String getArabicDes() {
        return arabicDes;
    }

    public void setArabicDes(String arabicDes) {
        this.arabicDes = arabicDes;
    }

    public String getEnglishDes() {
        return englishDes;
    }

    public void setEnglishDes(String englishDes) {
        this.englishDes = englishDes;
    }
}
