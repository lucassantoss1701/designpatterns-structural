package designpatterns;

import designpatterns.adapter.adapters.PayoneerAdapter;
import designpatterns.adapter.payoneer.Payoneer;
import designpatterns.adapter.paypal.IPayPalPayments;
import designpatterns.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}
