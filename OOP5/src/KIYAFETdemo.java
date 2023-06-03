public class KIYAFETdemo extends MARKETdemo {

    private String colour;
    private int urunNo;
    private String beden;

    public KIYAFETdemo(String name, double price, String type, int adetNumber, int etiketNo, String colour, int urunNo, String beden) {
        super(name, price, type, adetNumber, etiketNo);
        this.colour = colour;
        this.urunNo = urunNo;
        this.beden = beden;
    }

    public String getColour() {
        return colour;
    }

    public void setColour() {
        this.colour = colour;
    }

    public int getUrunNo() {
        return urunNo;
    }

    public void setUrunNo() {
        this.urunNo = urunNo;
    }
    public String getBeden(){
        return beden;
    }
    public void setBeden(){
        this.beden = beden;
    }
    public void YAZDIR(){
        System.out.println(this.getName() + " bu ürünün rengi = " + this.getColour());
        System.out.println(this.getType() + " bu ürünün numarası = " + this.getUrunNo());
        System.out.println(this.getName() +  " alınan ürünün bedeni = " + this.getBeden());
    }
}