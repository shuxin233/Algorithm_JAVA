package Test.t227;

public class t2 {
    public static void main(String[] args) {
        System.out.println(6/2);
        System.out.println(5/2);
    }

    public int maximumScore(int a, int b, int c) {
        int max=Math.max(a,b);
        max=Math.max(max,c);
        int sum=0;
        if(max==a)sum=b+c;
        else if(max==b)sum=a+c;
        else sum=a+b;
        if(sum<=max)return sum;
        else return max+(sum-max)/2;
    }
}
