package AbstractAndInterface.ISP_PaymentExample;

// Step 1: Create separate interfaces for different payment methods
interface CashPayment {
    void payCash();
}

interface CardPayment {
    void payByCard();
}

interface MobilePayment {
    void payByMobile();
    void payByQR();
}

interface CryptoPayment {
    void payWithCrypto();
}

interface CashbackEligible {
    void Cashback();
}

// Step 2: Implement only the required interfaces for each class

// Cash-only payment class
class Cash implements CashPayment {
    @Override
    public void payCash() {
        System.out.println("Payment made using cash.");
    }
}

// Card payment class
class CreditCard implements CardPayment, CashbackEligible {
    @Override
    public void payByCard() {
        System.out.println("Payment made using card.");
    }

    @Override
    public void Cashback() {
        System.out.println("Cashback applied on card payment.");
    }
}

// Mobile payment class
class MobileWallet implements MobilePayment {
    @Override
    public void payByMobile() {
        System.out.println("Payment made using mobile wallet.");
    }

    @Override
    public void payByQR() {
        System.out.println("Payment made using QR code.");
    }
}

// Step 3: Implement CryptoPayment class
class Crypto implements CryptoPayment {
    @Override
    public void payWithCrypto() {
        System.out.println("Payment made using cryptocurrency.");
    }
}

// Step 4: Testing the solution
public class ISP_PaymentSolution {
    public static void main(String[] args) {
        CashPayment cash = new Cash();
        CardPayment card = new CreditCard();
        MobilePayment mobile = new MobileWallet();
        CryptoPayment crypto = new Crypto();

        // Testing different payment methods
        cash.payCash();
        card.payByCard();
        mobile.payByMobile();
        mobile.payByQR();
        crypto.payWithCrypto();
    }
}
