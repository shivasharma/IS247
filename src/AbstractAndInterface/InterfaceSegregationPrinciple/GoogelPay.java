package AbstractAndInterface.InterfaceSegregationPrinciple;

public class GoogelPay implements Payment {

    public void payCash() {
        //not applicable
    }

    public void payByCard() {
    }


    public void payByMobile() {
    }


    public void payByQR() {
        //This method is not application
    }

    @Override
    public void Cashback() {
        //not applicable
    }
}
