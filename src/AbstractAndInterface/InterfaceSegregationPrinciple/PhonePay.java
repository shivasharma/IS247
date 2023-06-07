package AbstractAndInterface.InterfaceSegregationPrinciple;

public class PhonePay implements Payment {
    @Override
    public void payCash() {
        //This method is not applicable
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
}
