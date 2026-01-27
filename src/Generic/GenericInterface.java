
/*
Key Points:
Generics allow you to write flexible, reusable, and type-safe code.
You can use generics with classes, methods, and interfaces.
The type parameter (T, K, V, etc.) is a placeholder for any type.
Generics are widely used in Java collections like ArrayList, HashMap, etc.
to make them work with any data type.
*/
// A generic interface
//Pair<K, V> is a generic interface with two type parameters
//(K for key, V for value).

interface Pair<K, V> {
    K getKey();
    V getValue();
}

public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("Age", 25);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }

// A class implementing the generic
//OrderedPair implements the Pair interface and works with any types for K and V.
static class OrderedPair<K, V> implements Pair<K, V> {
    private final K key;
    private final V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

