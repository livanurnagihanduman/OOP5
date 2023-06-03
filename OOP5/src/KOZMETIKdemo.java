public class KOZMETIKdemo extends MARKETdemo {
    private String rujColour;
    private int rujNo;
    private String maskaraOzellik;

    public KOZMETIKdemo(String name,double price,String type,int adetNumber,int etiketNo,String rujColour,int rujNo,String maskaraOzellik) {
        super(name,price,type,adetNumber,etiketNo);
        this.rujColour = rujColour;
        this.rujNo = rujNo;
        this.maskaraOzellik = maskaraOzellik;
    }
    public String getRujColour(){
        return rujColour;
    }
    public void setRujColour(){
        this.rujColour = rujColour;
    }
    public int getRujNo(){
        return rujNo;
    }
    public void setRujNo(){
        this.rujNo = rujNo;
    }
    public String maskaraOzellik(){
        return maskaraOzellik;
    }
    public void setMaskaraOzellik(){
        this.maskaraOzellik = maskaraOzellik;
    }

    public void ciktiYazdir(){
        System.out.println(this.getName() + " rengi = " + this.rujColour);
        System.out.println(this.getName() + " bu üünün no'su = " + this.rujNo);
        System.out.println(this.getName() + " bu maskara Maybelline markasının en iyi suya dayanıklı hacim veren  tutulan bir markasıdır***");
    }


}
