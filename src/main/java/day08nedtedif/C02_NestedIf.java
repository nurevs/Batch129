package day08nedtedif;

public class C02_NestedIf {
    /*
    Passwordun ilk harfi buyuk harf ise
    'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
    Passwordun ilk harfi kucuk harf ise 'z' olursa gecerli password yazdirin
    degilse gecersiz password yazdirin
     */

    public static void main(String[] args) {

        String pwd="Axy12!";
        char ilkHarf=pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            if (ilkHarf == 'A'){
            System.out.println("Gecerli");
            }else System.out.println("Gecersiz password");

        }else if (ilkHarf >='a' && ilkHarf <= 'z'){
            if (ilkHarf == 'z'){
                System.out.println("Gecerli");
            }else System.out.println("Gecersiz password");//kucuk harf olma ihtimali
        }
        else System.out.println("ilk karakter harf olmali ");
    }
}
