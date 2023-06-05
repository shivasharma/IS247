package AbstractAndInterface.InterfaceExamples;

interface FirstInterface {
    void myMethod();
}   // interface method

interface SecondInterface {
    void myOtherMethod();
}  // interface method

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class MultipleInterfaces {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}