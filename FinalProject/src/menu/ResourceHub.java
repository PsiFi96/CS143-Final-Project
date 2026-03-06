package menu;
import java.util.Scanner;



public class ResourceHub {

 

 public static void main(String[] args) {

 Scanner scnr = new Scanner(System.in);

 int choice;

 

 // Main Menu Loop (one down! 2 to go)

 do {

 displayMenu();

 choice = scnr.nextInt();

 

 handleChoice(choice, scnr);

 

 } while (choice != 6);

 

 scnr.close();

 }

 

 // Displays the main menu

 public static void displayMenu() {

 System.out.println("\nRECYCLING RESOURCES (java)");

 System.out.println("1. Learn What Can Be Recycled");

 System.out.println("2. Find Local Recycling Centers");

 System.out.println("3. Track Your Recycling Habits");

 System.out.println("4. Recycling Tips & Education");

 System.out.println("5. Recycling Impact Calculator");

 System.out.println("6. Exit");

 System.out.print("Enter your choice: ");

 }

 

 // Routes user selection

 public static void handleChoice(int choice, Scanner scnr) {

 

 switch (choice) {

 

 case 1:

 recyclableMaterials();

 break;

 

 case 2:

 recyclingCenters();

 break;

 

 case 3:

 trackRecyclingHabits(scnr);

 break;

 

 case 4:

 recyclingEducation();

 break;

 

 case 5:

 recyclingImpactCalculator(scnr);

 break;

 

 case 6:

 exitProgram();

 break;

 

 default:

 System.out.println("Invalid. Choose a listed number");

 }

 }

 

 // FEATURE PLACEHOLDERS, Feel free to alter to your liking/exact desired feature, I tried to be general with these but set up ones that obviously lead into our required 'complex' features

 // do as you wish when it comes to files and stuff, I didn't set anything up but you guys can if you'd like

 

 // Feature 1 (Probably just return text to the user)

 public static void recyclableMaterials() {

 System.out.println("\nLearn What Can Be Recycled selected.");

 System.out.println("FOR FUTURE DEVELOPMENT");

 }

 

 // Feature 2 (Text return)

 public static void recyclingCenters() {

 System.out.println("\nFind Local Recycling Centers selected.");

 System.out.println("FOR FUTURE DEVELOPMENT");

 }

 

 // Feature 3 (Array feature)

 public static void trackRecyclingHabits(Scanner scnr) {

 System.out.println("\nTrack Your Recycling Habits selected.");

 System.out.println("FOR FUTURE DEVELOPMENT");

 }

 

 // Feature 4 (return text)

 public static void recyclingEducation() {

 System.out.println("\nRecycling Tips & Education selected.");

 System.out.println("FOR FUTURE DEVELOPMENT");

 }

 

 // Feature 5 (Calculation required, maybe prompt them for some recycling facts and then do a calculation to determine how much they're helping)

 public static void recyclingImpactCalculator(Scanner scnr) {

 System.out.println("\nRecycling Impact Calculator selected.");

 System.out.println("FOR FUTURE DEVELOPMENT");

 }

 

 // Feature 6

 public static void exitProgram() {

 System.out.println("\nThank you for using our Recycling informatic");

 }

}