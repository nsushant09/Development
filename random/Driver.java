package random;

public class Driver {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        user1.name = "Sushant";

        User user2 = User.getInstance();
        user2.name = "Urja";

        System.out.println(user1);
        System.out.println(user2);
    }
}

/*
* Create a driver class
* Create a paymentoption interface
* add pay method
* print pay method in each paypal skrill and esewa classes
* */


// PaymentOptions
// pay()

// Paypal implement paymentoption

// skrill implement paymentoption

// esewa implement paymentoption