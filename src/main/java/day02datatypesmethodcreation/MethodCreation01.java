package day02datatypesmethodcreation;

public class MethodCreation01 {


    /*
        Javada method nasil olusturulur?
        1) main methodun disinda olusturulur
        2)acces modifier + return type+ methos ismi + ()+ {}

        Olusturulan method nasil kullanilir?
        1)main methodun icinde kullanilir
        2)methodun ismi+()
        3)islem yapacaginiz sayilari () icine koyun

     */

    public static void main(String[] args) {

       int sonuc= add(3,5);
        System.out.println(sonuc);

    }
    public static int add(int a,int b){

       return a+b;
    }
    protected long mutliply(int a,int b){
        return a*b;

    }
}
