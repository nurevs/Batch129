package kendipraktiklerim.ReplitArrays;

public class Arrays2ve3 {
    public static void main(String[] args) {
        //int[] array= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int []  arrOrt = {20, 30, 25, 35, -16, 60, -100};
        double ort=0;
        int sum=0;

        for (int i=0;i<arrOrt.length;i++){

            sum+=arrOrt[i];
        }

        ort=sum/(arrOrt.length);

        System.out.println(ort);

    }





}
