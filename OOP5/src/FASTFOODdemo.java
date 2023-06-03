public class FASTFOODdemo extends MARKETdemo{
    private int kacTane;
    private String ambalajAdi;

    public FASTFOODdemo(String name,double price,String type,int adetNumber,int etiketNo,int kacTane,String ambalajAdi) {
        super(name,price,type,adetNumber,etiketNo);
            this.kacTane = kacTane;
            this.ambalajAdi = ambalajAdi;
        }


    public int getKacTane(){
        return kacTane;
    }
    public void setKacTane(){
        this.kacTane = kacTane;
    }
    public String getAmbalajAdi(){
        return ambalajAdi;
    }
    public void setAmbalajAdi(){
        this.ambalajAdi = ambalajAdi;
    }
    public void yazdir(){
        System.out.println(this.getName());
        System.out.println(this.getName() + " etiket numarası: " + getEtiketNo());
        System.out.println(this.getEtiketNo() + " etiket numarası bu olan ürünün türü; " + this.getType());
        System.out.println(this.getName() + " adet sayısı: " + getAdetNumber());
    }


}
