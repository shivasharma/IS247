package Generic.GenericDemo;

public class Data {


    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public static void main(String[] args) {
        //Data d1=new Data(12);
        // System.out.println(d1.getData());
    }

    /*
    //What will happend is we replace this with Object datatype
    // How do we handle if we need float/double/integer/String
    //This  break OCP => Open Close principle
    private Object data;
    public Data(Object data){
        this.data=data;
    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
*/
    @Override
    public String toString() {
        return "data is :" + data;
    }
}

