public class happynum {
    class Solution {
    public boolean isHappy(int n) {
        while(n!=1){
        int sum=0;
        int temp=n;
        int rem;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem);
            temp=temp/10;
            }
            n=sum;
            if(n==4)
            break;}
            if(n==1)
            return true;
            else
            return false;



        }
    }
}
