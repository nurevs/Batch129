package methodcreaationobjectcreation1;

public class MethodCreation01 {

    public static void main(String[] args) {

        // string’i yazdiran method olusturalim
        // hosgeldiniz diyen bir method olusturun
        // kapanma mesaji yazn bir method olustur

        //degerli arkadaslar SSG dersimizde Hosgeldiniz
        //Ali can Bey
        // Iki saynini Bolma yapiniz
        //2
        //Bizi tercih ettiginiz icin tesekkur ederiz

        hosgeldinizSsgDersleri();
        IsimVeSoyIsim("Ibrahim","Nalbant");
        IsimVeSoyIsim("Nurevsan","Ozturan");
        StringYazdir();
        Kapanma();


    }

    public static void hosgeldinizSsgDersleri()
    {
        System.out.println("Hosgeldiniz");
    }

    //Isimi ve Soy Isimi yazan bir method olustrun.
    public static void IsimVeSoyIsim(String isim,String soyIsim){
        System.out.println(isim + " "+ soyIsim);
    }
    public static void StringYazdir(){
        System.out.println("Iki sayinin bolumu");
        Calculator.Cikartma(4,2);

    }
    public static void Kapanma(){
        System.out.println("Bizi tercih ettiginiz icin tesekur ederiz");
    }




}
