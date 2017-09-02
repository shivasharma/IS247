package Generic;

/**
 * Created by Shiva on 9/2/2017.
 */
public class GenericMethodExample {

    public static void main(String args[]){
        //what will happen if we do that
        //int[] ints={10,20,30,40,50};
        Integer [] ints={10,20,30,40,50};
        String[] daysOfWeek= {"Monday","Tuesday" ,"Wednesday","Thursday","Friday","Saturday","Sunday"};
        print(ints);
        print(daysOfWeek);

    }
    public static<E> void print(E[] list){
        for(E element:list){
            System.out.println(element + " ");
        }
        System.out.println(" ");
    }
}
