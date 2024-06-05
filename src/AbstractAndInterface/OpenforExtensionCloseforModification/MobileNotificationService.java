package AbstractAndInterface.OpenforExtensionCloseforModification;

public class MobileNotificationService implements NotificationSericeInterface {
    @Override
    public void sentOTP(String medium) {
        //code to integrate mobile OTP using some API services like twillo etc
    }

    @Override
    public void sentConfirmation(String medium) {

    }
}
