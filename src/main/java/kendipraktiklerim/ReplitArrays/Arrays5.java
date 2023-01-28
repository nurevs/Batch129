package kendipraktiklerim.ReplitArrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays5 {

    public static void main(String[] args) {

/*
yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

```
Aranan Değer:2020
Beklenen Çıktı:**True**
```

Aranan Değer:2010

Beklenen Çıktı :**False**
 */

        int arr[]={1551,1223,1443,1267,1789,1023,2020};
        boolean isContains = false;
        Scanner input=new Scanner(System.in);
        System.out.println("Aranacak sayiyi yaziniz: 1551,1223,1443,1267,1789,1023,2020");
        int num=input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                isContains=true;
            }
        }
        System.out.println("**"+isContains+"**");




    }
}
