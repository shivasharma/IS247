package AbstractAndInterface.InterfaceSegregationPrinciple;

public class ApplePay implements Payment {
    @Override
    public void payCash() {
        //Not application for ApplyPay
    }

    @Override
    public void payByCard() {

    }

    @Override
    public void payByMobile() {

    }

    @Override
    public void payByQR() {

    }

    @Override
    public void Cashback() {
        //not applicable
    }
}
