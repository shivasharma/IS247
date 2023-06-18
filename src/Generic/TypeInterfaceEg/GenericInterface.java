package Generic.TypeInterfaceEg;

public interface GenericInterface<T> {

}

class GenericClass<T> implements GenericInterface<T> {

}
//class NormalClass implements  GenericInterface<T>{

//}
//Non generic class must specify the specific to implemention
interface Iinterface<T> {
}

interface Iinterface2 {
}

//class class0 implements Iinterface<T>{}
class class0 implements Iinterface<Integer> {
}

class class1 implements Iinterface<Iinterface2> {
}

class class2<T> implements Iinterface2 {
}

class class3<T> extends class2<T> implements Iinterface2 {
}

/**** Implementing different type *******/
class class4<T> implements Iinterface<T> {
}
//class class5 <T> extends class4<T> implements  Iinterface<Integer>{}
//class class5 <T> extends class4<T> implements  Iinterface<T>{}
