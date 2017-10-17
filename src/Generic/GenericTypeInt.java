package Generic;


interface GenericInterface<T> {
    T getT();

    void setT(T t);

    void SetString(String s);

    String getTString();
}

public class GenericTypeInt {


    class GenericClassA implements GenericInterface {
        @Override
        public Object getT() {
            return null;
        }

        @Override
        public void setT(Object o) {

        }

        @Override
        public void SetString(String s) {

        }

        @Override
        public String getTString() {
            return null;
        }
    }

    class GenericClass<T> implements GenericInterface<T> {
        T t;

        //Implementing setT() method

        @Override
        public T getT() {
            return t;
        }

        //Implementing getT() method

        @Override
        public void setT(T t) {
            this.t = t;
        }

        @Override
        public void SetString(String s) {

        }

        @Override
        public String getTString() {
            return "Shiva sharma";
        }
    }
}
