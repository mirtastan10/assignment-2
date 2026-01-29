import java.util.Scanner;

public class arrayCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        input.nextLine();
        int[] randomArray = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            randomArray[i] = (int) Math.floor(Math.random() * 101);
        }

        boolean running = true;

        while(running == true){

            System.out.println("\n===== MENU =====");
            System.out.println("1. Display array");
            System.out.println("2. Find min and max");
            System.out.println("3. Average and differences");
            System.out.println("4. Sum of even/odd indexes");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            input.nextLine();

            if(choice == 1){
                for(int i = 0; i < randomArray.length; i++){
                    System.out.print(randomArray[i] + " ");
                }
                System.out.println();

            } 
            else if(choice == 2){
                System.out.println("Min/Max not implemented.");

            } 
            else if(choice == 3){
                System.out.println("Average not implemented.");

            } 
            else if(choice == 4){
                System.out.println("Odd/Even index sums not implemented.");

            } 
            else if(choice == 0){
                running = false;
                System.out.println("Exiting program.");

            } 
            else{
                System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}
