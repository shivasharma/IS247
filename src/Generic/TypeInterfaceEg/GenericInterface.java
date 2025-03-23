

/* Start */
//1. Generic Interface and Class
public interface GenericInterface<T> {
}
class GenericClass<T> implements GenericInterface<T> {
}
/*
GenericInterface<T>: This is a generic interface with a type parameter T. It can work with any type.
GenericClass<T>: This is a generic class that implements the GenericInterface<T>. It uses the same type parameter T as the interface.
Key Point: A generic class can implement a generic interface by using the same type parameter.
*/
//*******************End ****************************
//2. Non-Generic Class Implementing a Generic Interface
//class NormalClass implements  GenericInterface<T>{
//}
/*
This code is commented out because it is invalid.
A non-generic class cannot implement a generic interface without specifying a concrete type for the type parameter T.
 */
/*
class NormalClass implements GenericInterface<Integer> {
}
Here, NormalClass implements GenericInterface with a specific type (Integer).
This is valid because the type parameter T is replaced with a concrete type.
 */

//Nongeneric class must specify the specific to

/*
3. Generic and Non-Generic Interfaces
Iinterface<T>: A generic interface with a type parameter T.
Iinterface2: A non-generic interface (no type parameters).

 */
interface Iinterface<T> {
}
interface Iinterface2 {
}

//class class0 implements Iinterface<T>{}
/*
4. Classes Implementing Generic Interfaces
class0: Implements Iinterface with a specific type (Integer).
class1: Implements Iinterface with another interface (Iinterface2) as the type.
Key Point: When a non-generic class implements a generic interface, it must specify a concrete type for the type parameter.
*/
 class class0 implements Iinterface<Integer> {
}
class class1 implements Iinterface<Iinterface2> {
}
/*
5. Generic Classes Extending Other Classes
class2<T>: A generic class that implements a non-generic interface (Iinterface2).
class3<T>: A generic class that extends class2<T> and also implements Iinterface2.
Key Point: Generic classes can extend other generic or non-generic classes and implement interfaces.
 */
class class2<T> implements Iinterface2 { }
class class3<T> extends class2<T> implements Iinterface2 {}

/**** Implementing different type *******/
/*
 6. Implementing Different Types
class4<T>: A generic class that implements Iinterface<T>.
 */
class class4<T> implements Iinterface<T> {
}
/*
The commented-out class5 examples show invalid combinations:
A class cannot simultaneously implement a generic interface with a specific type (Iinterface<Integer>) and a generic type (Iinterface<T>).
A class must consistently use the same type parameter or specify a concrete type.
 */
//class class5 <T> extends class4<T> implements  Iinterface<Integer>{}
//    class class5 <T> extends class4<T> implements  Iinterface<T>{}
