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
            System.out.println("2. Find min");
            System.err.println("3. Find max");
            System.out.println("4. Average and differences");
            System.out.println("5. Sum of even/odd indexes");
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
                int min = 102;
                for (int i = 0; i < randomArray.length; i++) {
                    if (randomArray[i] < min) {
                        min = randomArray[i];
                    }
                }

                System.out.println("Minimum integer in array: " + min);
            } 
            else if(choice == 3){
                int max = -1;
                for (int i = 0; i < randomArray.length; i++) {
                    if (randomArray[i] > max) {
                        max = randomArray[i];
                    }
                }

                System.out.println("Max integer in array: " + max);
            } 
            else if(choice == 4){
                int total = 0;
                for(int i = 0; i< randomArray.length; i++){
                    total += randomArray[i];
                }
                int average = total / randomArray.length;
                System.out.print("Differences from average: ");
                for(int j = 0; j < randomArray.length; j++){
                    int dif = randomArray[j] - average;
                    System.out.print(dif + " ");
                } 
            }
            else if (choice == 5) {
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
