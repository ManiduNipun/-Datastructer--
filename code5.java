package githubcode;
import java.util.Scanner;

public class code5 {

    // Recursive method to solve the Tower of Hanoi puzzle
    public static void hanoi(int num, char source, char target, char auxiliary) {
        
        // Base case: only one disk to move
        if (num == 1) {
            System.out.println("Move disk from " + source + " to " + target);
            return;
        }
        
        // Move n-1 disks from source to auxiliary
        hanoi(num - 1, source, auxiliary, target);
        
        // Move the nth disk from source to target
        System.out.println("Move disk " + num + " from " + source + " to " + target);
        
        // Move the n-1 disks from auxiliary to target
        hanoi(num - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of disks
        System.out.println("Enter your puzzle count: ");
        int num = input.nextInt();
        
        // Solve the Tower of Hanoi puzzle
        hanoi(num, 'A', 'C', 'B');
        
        // Close the scanner
        input.close();
    }
}
