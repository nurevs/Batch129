package kendipraktiklerim.ReplitArrays;

import java.util.Scanner;

public class Arrays6 {
    /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

```
Aranan değer:56

Beklenen Çıktı:
```

56 sayısı arrayin 4. elemanı
```
     */

    public static void main(String[] args) {
        int arr[]= {12,15,43,23,56,76,78,90,77,43};
        Scanner input=new Scanner(System.in);
        System.out.println("12,15,43,23,56,76,78,90,77,43  degerlerinden birini giriniz");
        int num=input.nextInt();

        for (int i=0;i<arr.length;i++){

            if (num==arr[i]){
                System.out.println(num+" sayisi arrayin "+(i+1)+". elemani");
            }

        }//System.out.println("12,15,43,23,56,76,78,90,77,43  degerlerinden birini girmeniz lazim");



    }
}
