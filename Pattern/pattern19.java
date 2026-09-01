public class pattern19 {
    public static void main(String[] args) {
        
    
        for (int i = 0; i < 5; i++) {
            // Print characters from ('A' + N - 1 - i) to ('A' + N - 1)
            for (char ch = (char) ('A' + 5 - 1 - i); ch <= (char) ('A' + 5 - 1); ch++) {
                System.out.print(ch + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}

