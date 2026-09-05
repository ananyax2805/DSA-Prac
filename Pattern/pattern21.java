public class pattern21 {
    public static void main(String[] args) {
       //first half
                
       //*        *     
       //**      **    
       //***    ***  
       //****  ****
        int iniS=8;
        for(int i=1;i<=4;i++) //rows
        {
            for(int j=0;j<i;j++){ //stars LHS
            
                System.out.print("*");
        }
        for(int j=0;j<iniS;j++) //spaces
        {
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){ //stars rhs
            System.out.print("*");
        } 
        iniS-=2;

    
    System.out.println();
        }
    
        //********** 
    for(int j=0;j<10;j++) //middle row of 10 stars
    {
        System.out.print("*");
    }
    System.out.println();

//second half
/* ****  ****
   ***    ***
   **      **
   *        * */

int iniSp=2;
for(int i=0;i<4;i++) //rows
{
    for(int j=4;j>i;j--) //stars lhs
    {
System.out.print("*");
    }
    for(int j=0;j<iniSp;j++) //spaces
    {
        System.out.print(" ");
    }
    for(int j=4;j>i;j--) //stars rhs
    {
        System.out.print("*");
    }
    iniSp+=2;
    System.out.println();
}
    }
}
/*  *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *  */