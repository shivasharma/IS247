package AbstractAndInterface.OpenforExtensionCloseforModification;

public class NotificationService {
//Open-Closed Princlple (OCP) => The open-closed principle states that according to new requirements
// the module should be open for extension but closed for modification

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write some logic here
        }
        if (medium.equals("facebook")) {
            //some logic here
        }
        //what will happend if in future we need to add another notification method for e.g. sendOPT via whatsapp,twitter,instagram etc..
        //Do we modify this code?
        
    }
}
