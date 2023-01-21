package kendipraktiklerim.ReplitArrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int arrNum[] ={1232, 1134,2345,1022};
        String arrSt[]={"Java", "Python", "PHP", "C#","C Programming","C++"};

       Arrays.sort(arrNum);
       Arrays.sort(arrSt);

        System.out.println(Arrays.toString(arrNum));
        System.out.println(Arrays.toString(arrSt));


//        for (int i=0;i<arrNum.length-1;i++){
//
//            if (arrNum[i]< arrNum[i+1]){
//                idx++;//bir sonraki indexe gecer
//            }
//        }







    }



}
