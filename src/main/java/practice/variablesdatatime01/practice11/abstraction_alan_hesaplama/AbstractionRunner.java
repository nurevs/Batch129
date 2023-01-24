package practice.variablesdatatime01.practice11.abstraction_alan_hesaplama;

public class AbstractionRunner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();

        System.out.println(dikdortgen.alanHesapla(5,4));
        System.out.println(dikdortgen.alanHesapla(5,6));

        Ucgen ucgen =new Ucgen();
        ucgen.alanHesapla(3,5);







    }
}
