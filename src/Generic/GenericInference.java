package Generic;

public class GenericInference {

    //Java Generic Method
    public static <T> boolean isEqual(GenericsTypeClass<T> g1, GenericsTypeClass<T> g2) {
        return g1.get().equals(g2.get());

    }

    public static void main(String args[]) {
        GenericsTypeClass<String> g1 = new GenericsTypeClass<>();
        g1.set("Shiva");

        GenericsTypeClass<String> g2 = new GenericsTypeClass<>();
        g2.set("Shiva");

        boolean isEqual = GenericInference.isEqual(g1, g2);
        //above statement can be written simply as
        isEqual = GenericInference.isEqual(g1, g2);
        System.out.println(isEqual);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
    }

    public static class GenericsTypeClass<T> {
        private T t;

        public T get() {
            return this.t;
        }

        public void set(T t1) {
            this.t = t1;
        }

    }
}

