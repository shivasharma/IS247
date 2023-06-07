package AbstractAndInterface.InterfaceSegregationPrinciple;

public class PersonPay implements CashPay {

    @Override
    public void payCash() {
        //This method is only applicable to pay by cash in person
    }
}
