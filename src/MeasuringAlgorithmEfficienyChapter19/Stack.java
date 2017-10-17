package MeasuringAlgorithmEfficienyChapter19;/*
package MeasuringAlgorithmEfficienyChapter19;

public class Stack<T> {
    private T[] data;
    private int stackPointer;
    public Stack(){
        data=(T[]) new Object[1000];
    }
    public void push (T newItem){
        data[stackPointer++]=newItem;
    }
    public T pop(){
        if(stackPointer==0){
            throw  new IllegalStateException("No more items on the stack");
        }
        return data[--stackPointer];
    }

    public boolean contains(T item){
        boolean found=false;

        for (int i = 0; i <stackPointer ; i++) {
            if(data[i].equals(item)){
                found=true;
                break;
            }
        }

        return found;
    }
    public T access(T item){
       return ;
    }

}
*/