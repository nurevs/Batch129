package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //1)while-loop
        int i=1;

        while (i<1) {
            System.out.println("Sen bir wwhile loopsun...");
            i++;
        }

        //While body hic calismadi.
        // While-loopta Zero Execution mumkundur.



        //2)do-while -loop

        int k=1;
        do {
            System.out.println("Sen bir do-while-loopsun...");
            k++;
        }while (k<1);

        //do-while body calisir
        //do-whileda loop body en az bir kere calisir.
        //yani do-while da Zero Execution mumkun degildir.




    }
}
