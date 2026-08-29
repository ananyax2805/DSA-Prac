public class pattern13 {
    public static void main(String[] args) {
        int spaces= 2*(4-1);
        for(int i=1;i<=4;i++) //rows
        {
          for(int j=1;j<=i;j++) //left side inc no.s
          {
            System.out.print(j);
          }
          for(int j=1;j<=spaces;j++) // prints 6 spaces 1st time
          {
            System.out.print(" ");
          }
          for(int j=i;j>=1;j--)
          {
            System.out.print(j);
          }
          System.out.println();
          spaces=spaces-2; //decreases spaces by 2 for next iteration
        }
    }
}
