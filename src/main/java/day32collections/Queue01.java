package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
    /*
    "Queue" larda ilk giren ilk isleme girer.(First in First Out)==>FIFO
    Bazende sdon gelen ilk isleme girer."Last in First Out"==> LIFO
    "Deque" "Double Ended Queue" hem FIFO hemde LIFO icin kullanilir.

    "Queue "bir interface'dir. Bu yuzden constructor'i yoktur. bu yuzden new keywordunden sonra kullanilamaz.
    Yani object olusturamaz new'den sonra.
    "new" keyword'ünden sonra data type'i "Queue" olan bir object oluşturmak için "new" keyword'unden sonra
     i)LinkedList veya ii)PriorityQUeue Class'ları kullanılabilir

    Queue olustururken constructer olarak "PriorityQueue"   kullanirsaniz, elemanlari kendi belirleyeceginiz kurallara gore
    siralama hakkiniz olur.

     */


        Queue<String > myQueue=new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury Water");

        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury Water]
        //Verdigimiz siraya gore dizdi. cunku LinkedList

        //Retrieves and removes the "head of this queue", or returns "null" if this queue is empty.
        myQueue.poll();

        //Retrieves,but does not remove,the head of this queue.
        //This method differs from peek only in that it throws an exception if this queue is empty.
        //Throws: NoSuchElementException- if this queue is empty.
        myQueue.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        myQueue.peek();


        //Retrieves and removes the head of this queue.
        // This method differs from poll() only in that it throws an exception if this queue is empty.
        //Returns: the head of this queue
        myQueue.remove();

        /*
        poll() ile remove() ikisi de ilk elemani siler size verir.
        poll() bos queue'lar icin "null" verir,remove() ise exception atar.
         */

        //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        //When using a capacity-restricted queue, this method is generally preferable to add,
        // which can fail to insert an element only by throwing an exception.
        //Returns:true if the element was added to this queue, else false
        //Throws:
        //ClassCastException – if the class of the specified element prevents it from being added to this queue
        //NullPointerException – if the specified element is null and this queue does not permit null elements
        //IllegalArgumentException – if some property of this element prevents it from being added to this queue
        boolean r= myQueue.offer("Avocado");
        System.out.println(r);//true
        System.out.println(myQueue);//[Jam, Egg, Luxury Water, Avocado]


        Queue<String > yourQueue=new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury Water");

        System.out.println(yourQueue);//[Butter, Egg, Jam, Milk, Luxury Water]




    }
}
