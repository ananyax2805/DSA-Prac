public class pattern10
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++){ //rows

        
        for(int j= 0 ; j< n-i-1; j++) //spaces
        { 
            System.out.print(" ");
        }

            for(int j=0; j<2*i+1;j++) //stars
            {
System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++) //spaces
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++)        { //rows

           for(int j=0; j<i;j++) //spaces
           {
            System.out.print(" ");
           }
           for(int j=0 ; j< 2*n -(2*i+1);j++) //stars
           {
            System.out.print("*");
           }
           for(int j=0;j<i;j++) //spaces
           {
            System.out.print(" ");
           }
           System.out.println();

        }
    }
}