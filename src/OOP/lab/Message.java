package OOP.lab;

/**
 * Created by Shiva on 8/20/2017.
 */
public class Message {
    public static void main(String[] args) {

        //create an object of thought class
        //call a message method from thought class

        //create an object of advice class
        //call a message method from advice class


    }
}

class Thought {
    public void message() {

        //print a simple message "This is a message from thought class"

    }

}

class Advice extends Thought {

    public void message() {
        //print a simple message "This is a message from message class"


        //explicilty call the message method  of the  parent class

    }
}
