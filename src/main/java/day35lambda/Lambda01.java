package day35lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    /*
    1)Lambda="Functional programming"dir,digeri "Scructured Programming"dir.
    2)"Functional programming" ne yapmak gerekir(What to do?) ile ilgilenir, "nasil" yapmak (How to do?)gerekirle ilgilenmez.
    3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
    4)Lambda, Java'ya "Java 8"de eklendi.
    "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
    "filter()" filtrelemek icin kullanilir.
    "map()" u var olan elemani degistirmek icin kullanilir.
    "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
     Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
    "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
    Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
    "u" ise degerlerini her zaman "stream" den alir

     */


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElement1(nums);
        printElement2(nums);//functional
        System.out.println();
        printEvenElement1(nums);//12 14 10 4 12
        System.out.println();
        printEvenElement2(nums);//12 14 10 4 12
        System.out.println();
        printSquareOfOddElement(nums);//81 17161 81 225
        System.out.println();
        printCubeOfDistinctOddElement(nums);//729 2248091 3375
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);//456
        printProductOfCubesOfDistinctEvenElements(nums);//45158400
        getMaxValue(nums);//131
        getMaxValue3(nums);//131
        getMaxValue2(nums);//131
        getMinValue(nums);//4
        getMinValue2(nums);//4
        getMinGreaterThanSevenEven(nums);//10
    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.

    public static void printElement1(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");

        }
        System.out.println();
    }


    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.Functional kullanalim.
    public static void printElement2(List<Integer> nums) {

        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
    //3)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.

    public static void printEvenElement1(List<Integer> nums) {

        for (Integer w : nums
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
    //4)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.

    public static void printEvenElement2(List<Integer> nums) {

        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " ")); //ciftleri filtreledik

    }
    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements
    //5)Bir Listteki tek sayi olan elemanlarin karelerini ayni satirda aralarina bosluk koyarak yazdiran methodu olustur

    public static void printSquareOfOddElement(List<Integer> nums) {


        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
        //map() methodu varolan elemani "update" etmek icin kullanilir
    }
    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
//  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    public static void printCubeOfDistinctOddElement(List<Integer> nums) {

        //distinct methodu listeyi tekrarsiz yapiyor. ayni olanlari siliyor.

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        //reduce() coklu degerleri azaltmak icin kullanilir.
        //reduce(0,(t,u)->t+u);==> basta toplam=0, "t ve u degeri verecegiz sana java ve sen onlari toplayacaksin."

        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static void printProductOfCubesOfDistinctEvenElements(List<Integer> nums) {

        Integer product = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(product);

    }

    //9)Create a method to find the "maximum value" from the list elements

    //1.yol-->bu yol daha iyi
    public static void getMaxValue(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //3.yol
    public static void getMaxValue3(List<Integer> nums) {

        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);
    }

    //10)Create a method to find the minimum value from the list elements
    public static void getMinValue(List<Integer> nums) {

        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(min);
    }
    //2.yol
    public static void getMinValue2(List<Integer> nums) {

        //Comparator.reverseOrder()==> tersten order yaptik
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);
    }
    //11)Create a method to find the minimum value which is greater than 7 and even from the list
//   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer> nums) {

        Integer min=nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }


}
