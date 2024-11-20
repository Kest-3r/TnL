package Viva1;
import java.util.Scanner;
public class Viva1Q4 {


    public static void main(String[] args) {

        //Variable Declarations

        Scanner f = new Scanner(System.in);
        int option;
        double price = 0;

        // Track the order and qualify discount
        boolean orderedPizza = false;
        boolean orderedDrink = false;
        boolean orderedDessert = false;



        // Main Menu
        mainMenu: while (true) {
            System.out.println("\nWelcome to Maroni's Pizza!");
            System.out.println("1. Pizza");
            System.out.println("2. Drinks");
            System.out.println("3. Dessert");
            System.out.println("4. CHECKOUT\n");
            System.out.print("Pick an option (1,2,3,4): ");
            option = f.nextInt();

            switch (option) {

                case 1 -> {
                    // label(pizzaMenu)and nested a while loop
                    pizzaMenu: while (true) {
                        System.out.println("\nPIZZA");
                        System.out.println("1. Chicken Pepperoni - RM15");
                        System.out.println("2. Chicken Supreme - RM18");
                        System.out.println("3. Vegan Indulgence - RM12");
                        System.out.println("4. Beef Delight - RM22");
                        System.out.println("5. Margherita - RM9");
                        System.out.println("6. BACK TO MENU");
                        System.out.print("\nPick an option (1-6): ");
                        option = f.nextInt();

                        switch (option) {
                            case 1:
                                price += 15;
                                orderedPizza = true;
                                System.out.println("\nPick an option: 1" );
                                System.out.println("Added Chicken Pepperoni");
                                System.out.println("Current Total: RM" + price);
                                continue;//here is back to pizza menu

                            case 2:
                                price += 18;
                                orderedPizza = true;
                                System.out.println("\nPick an option: 2" );
                                System.out.println("Added Chicken Supreme");
                                System.out.println("Current Total: RM" + price);
                                continue;//here is back to pizza menu

                            case 3:
                                price += 12;
                                orderedPizza = true;
                                System.out.println("\nPick an option: 3" );
                                System.out.println("Added Vegan Indulgence.");
                                System.out.println("Current Total: RM" + price);
                                continue;//here is back to pizza menu

                            case 4:
                                price += 22;
                                orderedPizza = true;
                                System.out.println("\nPick an option: 4" );
                                System.out.println("Added Beef Delight");
                                System.out.println("Current Total: RM" + price);
                                continue;//here is back to pizza menu

                            case 5:
                                price += 9;
                                orderedPizza = true;
                                System.out.println("\nPick an option: 5" );
                                System.out.println("Added Margherita");
                                System.out.println("Current Total: RM" + price);
                                continue;//here is back to pizza menu

                            case 6:
                                break pizzaMenu;

                            default:
                                System.out.println("Invalid option. Please try again.");
                        }

                    }
                    continue;//back to main menu
                }



                case 2 -> {
                    // Drinks Menu
                    drinksMenu: while (true) {
                        System.out.println("\nDRINKS");
                        System.out.println("1. Strawberry Smoothie - RM8");
                        System.out.println("2. Banana Smoothie - RM8");
                        System.out.println("3. Mocktail - RM12");
                        System.out.println("4. Soft Drink - RM5");
                        System.out.println("5. Mineral Water - RM3");
                        System.out.println("6. BACK TO MENU");
                        System.out.print("Pick an option (1-6): ");
                        option = f.nextInt();

                        switch (option) {
                            case 1:
                                price += 8;
                                orderedDrink = true;
                                System.out.println("\nPick an option: 1" );
                                System.out.println("Added Strawberry Smoothie");
                                System.out.println("Current Total: RM" + price);

                                continue;//back to drinks menu

                            case 2:
                                price += 8;
                                orderedDrink = true;
                                System.out.println("\nPick an option: 2" );
                                System.out.println("Added Banana Smoothie");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to drinks menu



                            case 3:
                                price += 12;
                                orderedDrink = true;
                                System.out.println("\nPick an option: 3" );
                                System.out.println("Added Mocktail");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to drinks menu



                            case 4:
                                price += 5;
                                orderedDrink = true;
                                System.out.println("\nPick an option: 4" );
                                System.out.println("Added Soft Drink");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to drinks menu



                            case 5:
                                price += 3;
                                orderedDrink = true;
                                System.out.println("\nPick an option: 5" );
                                System.out.println("Added Mineral Water");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to drinks menu



                            case 6:
                                break drinksMenu;

                            default:
                                System.out.println("Invalid option. Please try again.");
                        }
                    }
                    continue;//main menu
                }



                case 3 -> {
                    // Dessert Menu
                    dessertMenu: while (true) {
                        System.out.println("\nDESSERT");
                        System.out.println("1. Tiramisu - RM7");
                        System.out.println("2. Strawberry Shortcake - RM10");
                        System.out.println("3. Green Jello - RM4");
                        System.out.println("4. Creme Brulee - RM15");
                        System.out.println("5. Raspberry Pie - RM20");
                        System.out.println("6. BACK TO MENU");
                        System.out.print("Pick an option (1-6): ");
                        option = f.nextInt();


                        switch (option) {
                            case 1:
                                price += 7;
                                orderedDessert = true;
                                System.out.println("\nPick an option: 1" );
                                System.out.println("Added Tiramisu");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to dessertmenu

                            case 2:
                                price += 10;
                                orderedDessert = true;
                                System.out.println("\nPick an option: 2" );
                                System.out.println("Added Strawberry Shortcake");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to dessertmenu



                            case 3:
                                price += 4;
                                orderedDessert = true;
                                System.out.println("\nPick an option: 3" );
                                System.out.println("Added Green Jello");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to dessertmenu



                            case 4:
                                price += 15;
                                orderedDessert = true;
                                System.out.println("\nPick an option: 4" );
                                System.out.println("Added Creme Brulee");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to dessertmenu

                            case 5:
                                price += 20;
                                orderedDessert = true;
                                System.out.println("\nPick an option: 5" );
                                System.out.println("Added Raspberry Pie");
                                System.out.println("Current Total: RM" + price);
                                continue;//back to dessertmenu



                            case 6:
                                break dessertMenu;

                            default:
                                System.out.println("Invalid option. Please try again.");
                        }
                    }
                    continue;//back to main menu
                }



                case 4 -> {
                    // Checkout
                    if (orderedPizza && orderedDrink && orderedDessert) {
                        System.out.println("Your total is:"+price);
                        System.out.println("You have availed the One-of-each offer. You get a 20% discount!");
                        double discount = price * 0.20;
                        price -= discount;
                    }

                    System.out.printf("New total price: RM%.2f\n" ,price);
                    System.out.println("Thank you for your payment.");
                    System.out.println("Have a nice day!");
                    break mainMenu;

                }
                default -> System.out.println("Invalid option. Please try again.");
            }

        }

    }
}
