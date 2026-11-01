import java.util.*;
class largestdig{
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int rem, largest=0;
while(n!=0){
    rem=n%10;
if(rem>largest){
    largest=rem;
         
    }
    n=n/10;
}
    System.out.println(largest);
}
}