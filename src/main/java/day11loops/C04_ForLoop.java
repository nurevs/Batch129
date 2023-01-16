package day11loops;

public class C04_ForLoop {
    public static void main(String[] args) {

        //1'den 100'e kadar kki syilardan 6ya bolumunmeyenleri yazdir
//
//        for (int i = 1; i <101 ; i++) {
//            if(i%6 ==0){
//                continue;
//            }
//            System.out.println(i);
//
// }

        //INTERWIEV SORUSU
        //Size verilen bir stringi ters ceviren kodu yaziniz

        String str="Nurevsan";
        String strTers="";

        for (int i=str.length()-1;i>-1;i--){

           char ch=str.charAt(i);
           //strTers=strTers+ch;
            strTers+=ch;
        }
        System.out.print(strTers);







    }
}
