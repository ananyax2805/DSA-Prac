import java.util.*;
class countodd{
public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
        int rem,count=0;
        while(n!=0){
            rem=n%10;    
            if(rem%2!=0)
            count++;
            n=n/10;
        }
        System.out.println(count);

    }
}