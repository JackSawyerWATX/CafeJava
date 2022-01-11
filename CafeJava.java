public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly. ";
        String readyMessage = ", your order is ready! ";
        String displayTotalMessage = "Your total is $";
    
        double mochaPrice = 3.55;
        double dripPrice = 1.25;
        double lattePrice = 4.65;
        double cappucinoPrice = 3.75;
    
        String customer1 = "Ricky";
        String customer2 = "Lucy";
        String customer3 = "Fred";
        String customer4 = "Ethel";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        if(isReadyOrder1)
        System.out.println(pendingMessage);
    
        if(isReadyOrder2)
        System.out.println(readyMessage);
    
        if(isReadyOrder3)
        System.out.println(pendingMessage);
    
        if(isReadyOrder4)
        System.out.println(readyMessage);
    
        System.out.println(generalGreeting + customer1 + pendingMessage+  displayTotalMessage + mochaPrice);
        System.out.println(generalGreeting + customer2 + readyMessage + displayTotalMessage + dripPrice);
        System.out.println(generalGreeting + customer3 + pendingMessage + displayTotalMessage + lattePrice);
        System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + cappucinoPrice);
    }
}
