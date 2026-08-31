public class pattern17 {
    public static void main(String[] args) {
        
   
        // Outer loop for the number of rows
        for (int i = 0; i < 5; i++) {
            
            // Define the character for each row based on row index
            char ch = (char) ('A' + i);
            
            // Inner loop to print the character for i times in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");  // Print the character followed by a space
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }

}

        
    