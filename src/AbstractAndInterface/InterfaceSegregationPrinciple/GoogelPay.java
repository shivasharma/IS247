package AbstractAndInterface.InterfaceSegregationPrinciple;

public class GoogelPay implements Payment {

    public void payCash() {
        //This method is not applicable at this point it is forcing to use this method which has no purpose
    }

    public void payByCard() {
    }


    public void payByMobile() {
    }


    public void payByQR() {
        //This method is not applicable at this point it is forcing to use this method which has no purpose
    }

    @Override
    public void Cashback() {
        //This method is not applicable at this point it is forcing to use this method which has no purpose
    }
}
