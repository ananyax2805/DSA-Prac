public class pattern16 {
    public static void main(String[] args) {
        for(int i=4;i>=0;i--)
        {
            for(char ch='A'; ch<='A'+i;ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
