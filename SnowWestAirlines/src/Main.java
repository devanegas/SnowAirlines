import java.util.*;
public class Main {

    public static void main(String[] args) {
        flightMenu();
    }

    public static void flightMenu(){
        System.out.println("Where would you like to go?\n\n\t1. Salt Lake City, UT\n\t2. Los Angeles, CA\n\t3. Exit");
        System.out.printf("\nWhich option?: >");
        Scanner get = new Scanner(System.in);
        int choice = get.nextInt();

        switch(choice){
            case 1: {
                Flight yourFlight = new EphrToSLC();
                productMenu(yourFlight);
            }
            break;
            case 2: {
                Flight yourFlight = new EphrToLAX();
                productMenu(yourFlight);
            }
            break;
            case 3: return;
            default: return;
        }
    }

    public static void productMenu(Flight destination){
        boolean Done = false;
        int choice = 0;
        while(!Done) {
            System.out.printf("%s %s %s $%.2f %s" ,"\n********************************************************\n" +
                    "Your current purchase:\n\t>>",destination.getDescription(), "\n\t>> Subtotal: ", destination.cost(),
                    "\n********************************************************");
            System.out.println("\nWould you like to add any other services? \n[Press 0  to Cancel]\n\n\t" +
                            "1.  USB Charging Port\n\t" +
                            "2.  Eye Mask Rental\n\t" +
                            "3.  Wi-Fi\n\t" +
                            "4.  Personal Parachute\n\t" +
                            "5.  LiveTV \n\t" +
                            "6.  Headphone Rental\n\t" +
                            "7.  Blanket Rental \n\t" +
                            "8.  Drink Coupon \n\t" +
                            "9.  Excess Luggage\n\t" +
                            "10. [ I'm done ]"
            );

            System.out.printf("\nWhich option?: >");
            Scanner get = new Scanner(System.in);
            choice = get.nextInt();
            if(choice == 0){
                flightMenu();
            }

            if (choice < 0 || choice > 10){
                Done = false;
                System.out.println("Invalid Option");
            }
            else{
                Done = true;
            }

        }
        wrapper(destination, choice);
    }

    public static void wrapper(Flight destination, int choice){
        Flight temp = destination;

        switch(choice){
            case 1: {
                temp = new USBCharge(temp);
                productMenu(temp);
            }
            break;
            case 2: {
                temp = new Eyemask(temp);
                productMenu(temp);
            }
            break;
            case 3: {
                temp = new Wifi(temp);
                productMenu(temp);
            }
            break;
            case 4: {
                temp = new Parachute(temp);
                productMenu(temp);
            }
            break;
            case 5: {
                temp = new LiveTV(temp);
                productMenu(temp);
            }
            break;
            case 6: {
                temp = new Headphones(temp);
                productMenu(temp);
            }
            break;
            case 7: {
                temp = new Blanket(temp);
                productMenu(temp);
            }
            break;
            case 8: {
                temp = new DrinkCoupon(temp);
                productMenu(temp);
            }
            break;
            case 9: {
                temp = new ExcessLuggage(temp);
                productMenu(temp);
            }
            break;
            case 10:{
                System.out.printf("%s %s %s $%.2f " ,"Your Final Purchase:\n\t>>",temp.getDescription(), "\n\t>> Subtotal: ", temp.cost());
            }
            default: return;

        }
    }

}
