package Generic.GenericDemo;

class DataGeneric<T> {
    //T is the type parameter

    private T data;

    public DataGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is :" + data;
    }
}