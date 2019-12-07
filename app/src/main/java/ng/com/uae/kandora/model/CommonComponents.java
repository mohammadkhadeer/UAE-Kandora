package ng.com.uae.kandora.model;

public class CommonComponents {
    String arabicDes,englishDes;
    public CommonComponents(String arabicDes,String englishDes)
    {
        this.arabicDes=arabicDes;
        this.englishDes =englishDes;
    }

    public CommonComponents() {

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
