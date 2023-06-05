package AbstractAndInterface.InterfaceExamples;
/*
    Create IS247 interface
    Add a method that return PrintName on IPhone interface();
    String PrintName(sting name);
    implement this method which return the name.
    Print the name from the Main method

 */
interface Iphone {
    String name = "Iphone";

    void TakePhoto();

}

interface Android {
    void RecordVideo();
}

interface BlackBerry {
    void SendMessage();
}

interface Nokia {
    void Playgame();

}


//can you add interface name Windows and implement one of the method  in the SmartPhone class
public class SmartPhone implements Iphone, Android, BlackBerry, Nokia {

    public static void main(String[] args) {
        SmartPhone mysmartPhone = new SmartPhone();
        mysmartPhone.RecordVideo();
        mysmartPhone.TakePhoto();
        mysmartPhone.Playgame();
        mysmartPhone.SendMessage();
    }


    public void RecordVideo() {
        System.out.println("Andriod Interface Feature");
    }

    public void TakePhoto() {
        System.out.println("Iphone Interface Feature");
    }

    public void Playgame() {
        System.out.println("Nokia Interface Feature");
    }

    public void SendMessage() {
        System.out.println("BlackBerry Interface Feature");
    }
}