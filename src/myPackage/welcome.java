package myPackage;

import java.util.Scanner;

public class welcome {

    public static void main(String args[]){
        smoothie();
    }

    static void smoothie(){
        //WE want to give the user 4 options for smoothies
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        //User can say whatever they want, we will give them only one of the options
        System.out.println("Welcome to smooth smoothies, what kind would you like? [1] Onion 3.99 [2] Berry 5.99 [3] Banana -6.88 [4] Montreal Roast Beef 0.065");
        String choiceOfSmoothie = scanner.nextLine();
        if(choiceOfSmoothie.equals("Montreal Roast Beef") || choiceOfSmoothie.equals("4")){
            System.out.println("Great! You made the right choice");
        }else {
            System.out.println("You chose " + choiceOfSmoothie + ", we only have Montreal Roast Beef, so that's what you get");
        }
        totalPrice += 0.065;
        //Users pick toppings
        System.out.println("What topping do you want? [1] Glass Shards $3.99 [2] Tapioca Pearls $0.00 [3] Kidney Beans $0.50");
        boolean toppingSelected = false;
        String topping = null;
        while(!toppingSelected) {
            int toppingChoice = scanner.nextInt();
            switch (toppingChoice) {
                case 1:
                    System.out.println("Glass nice!");
                    topping = "glass";
                    totalPrice += 3.99;
                    toppingSelected = true;
                    break;
                case 2:
                    System.out.println("Perals nice!");
                    topping = "pearls";
                    toppingSelected = true;

                    break;
                case 3:
                    System.out.println("Beans nice!");
                    topping = "beans";
                    totalPrice += 0.50;
                    toppingSelected = true;
                    break;
                default:
                    System.out.println("not valid! try again!");
            }
        }

        System.out.println("You've chosen a " + choiceOfSmoothie + " smoothie with " + topping + " as a topping, subtotal is " + totalPrice);
        //Each smoothie has a price that we know and at the end, we tell the user the final cost
        System.out.println("GST: " + 0.14 * totalPrice);
    }

    static int add(int one, int two){
        return one + two;
    }

    /**
     * This method says hello
     * @author Sasha
     */
    static void myMethod(){
        System.out.println("hello");
    }
}
