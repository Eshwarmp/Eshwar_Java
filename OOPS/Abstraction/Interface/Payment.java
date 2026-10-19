package OOPS.Abstraction.Interface;

interface Paym {
    void pay(double amount);
}

class UPI implements Paym {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment " + amount);
    }
}

class Card implements Paym {
    @Override
    public void pay(double amount) {
        System.out.println("Card payment " + amount);
    }
}

public class Payment {
    public static void main(String[] args) {
        Paym paid = new UPI();
        paid.pay(500);

        paid = new Card();
        paid.pay(1000);
    }
}
