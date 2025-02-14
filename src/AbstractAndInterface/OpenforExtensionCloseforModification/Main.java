// Step 1: Create an interface for Notification
interface Notification {
    void sendOTP();
}

// Step 2: Implement different notification methods
class EmailNotification implements Notification {
    @Override
    public void sendOTP() {
        System.out.println("Sending OTP via Email...");
    }
}

class FacebookNotification implements Notification {
    @Override
    public void sendOTP() {
        System.out.println("Sending OTP via Facebook...");
    }
}

// Step 3: Now, if we want to add WhatsApp, we just create a new class
class WhatsAppNotification implements Notification {
    @Override
    public void sendOTP() {
        System.out.println("Sending OTP via WhatsApp...");
    }
}

// Step 4: Modify the NotificationService to follow OCP
class NotificationService {
    public void sendNotification(Notification notification) {
        notification.sendOTP();
    }
}

// Step 5: Test the OCP-compliant code
public class OCPExample {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
        Notification facebook = new FacebookNotification();
        Notification whatsapp = new WhatsAppNotification(); // New feature added without modifying existing code

        service.sendNotification(email); // Sending OTP via Email...
        service.sendNotification(facebook); // Sending OTP via Facebook...
        service.sendNotification(whatsapp); // Sending OTP via WhatsApp...
    }
}
