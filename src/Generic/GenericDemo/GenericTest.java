package Generic.GenericDemo;

public class GenericTest {
    public static void main(String[] args) {
        Data d1 = new Data("This is a data constructor");
        System.out.println(d1);

        //What will happen here will this create error.
        //Data d2=new Data(10);
        //int data=(int)d1.getData();


    }
}
