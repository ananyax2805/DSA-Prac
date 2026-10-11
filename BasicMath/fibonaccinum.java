class Solution {
    public int fib(int n) {
        if(n<=1)
        return n;
        int t1=0, t2=1;
        int nextterm;
        for(int i=2;i<=n;i++){
        nextterm=t1+t2;
        t1=t2;
        t2=nextterm;
        }
        return t2;
    }
}
