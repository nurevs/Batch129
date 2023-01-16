package practice.variablesdatatime01.advanced_practice.practice01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q05_ForEach_Eurodolar {
    public static void main(String[] args) {

        /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
    Ornek:
     String str ="$1 $12 €34 €56 $45 €78";
      dolarToplami: 58
      euroToplami: 168
     */
        String str ="$1 $12 €34 €56 $45 €78";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));//[$1, $12, €34, €56, $45, €78]

        int dolarToplam=0;
        int euroToplam=0;

        for (String w:arr){
            if (w.contains("$")){
                dolarToplam +=Integer.valueOf(w.replaceAll("\\D", ""));//Integer.valueof'la stringi integer e cevirdik
            }else {
                euroToplam +=Integer.valueOf(w.replaceAll("\\D", ""));

            }
        }
        System.out.println("dolarToplami: "+dolarToplam);
        System.out.println("euroToplami: "+euroToplam);




    }
}
