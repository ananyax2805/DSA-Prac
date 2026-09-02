public class pattern20 {
    // Function to print Pattern 19
    public static void main(String[] args) {
        // Initial spaces for upper half
        int iniS = 0;
        

        // Loop for upper half rows
        for (int i = 0; i < 5; i++) {
            // Print stars on left
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            // Print spaces in middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Print stars on right
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            // Increase middle spaces by 2
            iniS += 2;
            // Move to next row
            System.out.println();
        }

        // Initial spaces for lower half
        iniS = 2 * 5 - 2;

        // Loop for lower half rows
        for (int i = 1; i <= 5; i++) {
            // Print stars on left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Print stars on right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Decrease middle spaces by 2
            iniS -= 2;
            // Move to next row
            System.out.println();
        }
    }
}



