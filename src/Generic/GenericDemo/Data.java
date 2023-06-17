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


    /*
    //What will happend is we replace this with Object datatype

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
