package Generic.GenericeInterfaceExamples;

class Data<T> implements IData<T> {
    //T is the type parameter
    private T data;

    public Data(T data) {
        this.data = data;
    }


    @Override //This is implemented from IData interface
    public T getData() {
        return data;
    }

    @Override //This is implemented from IData interface
    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "data is :" + data;
    }


}