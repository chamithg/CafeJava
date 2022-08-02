public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCofee = 4.99;
        double latte = 2.99;
        double capuccino = 3.99;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String sam = "Sam";
        String jimmy = "Jimmy";
        String noah = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrderSam = true;
        boolean isReadyOrderJimmy = false;
        boolean isReadyOrderNoah = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // noah order 
        if(isReadyOrderNoah){
            System.out.println( noah+readyMessage);
        }else{
            System.out.println( noah+pendingMessage);

        }

        // sam order latte
        if(isReadyOrderSam){
            System.out.println( sam+readyMessage);
            System.out.println(displayTotalMessage + (latte * 2));
        }else{
            System.out.println( sam+pendingMessage);

        }
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}