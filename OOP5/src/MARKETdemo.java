public class MARKETdemo {

    private String name;
    private double price;
    private String type;
    private int adetNumber;
    private int etiketNo;

    public MARKETdemo(String name,double price,String type,int adetNumber,int etiketNo ){
        this.name = name;
        this.price = price;
        this.type = type;
        this.adetNumber = adetNumber;
        this.etiketNo = etiketNo;
    }
    public String getName(){
        return  name;
    }
    public void setName(){
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    public int getAdetNumber(){
        return adetNumber;
    }
    public void setAdetNumber(){
        this.adetNumber = adetNumber;
    }
    public int getEtiketNo(){
        return etiketNo;
    }
    public void setEtiketNo(){
        this.etiketNo = etiketNo;
    }
    public void YAZ(){
        System.out.println(this.getPrice());
    }

}
