public class Main {
    public static void main(String[] args) {
        System.out.println("********KAYA Mağazasına Hoşgeldiniz**********");

        KOZMETIKdemo magaza = new KOZMETIKdemo("Maybelline",199,"Maskara",10,56468,"Kırmızı",54464,"Suya Dayanıklı");
        magaza.ciktiYazdir();

        System.out.println("**********KAYA Markete hosşgeldiniz******");
        FASTFOODdemo market = new FASTFOODdemo("Karam",5.5,"Çikolata",5,978,1,"Paket");
        market.yazdir();

        System.out.println("***********KAYA AVM Hosgeldiniz*********");
        KIYAFETdemo avm = new KIYAFETdemo("GÖMLEK",130,"Elbise",125,154,"Beyaz",22,"XL");
        avm.YAZDIR();




    }
}