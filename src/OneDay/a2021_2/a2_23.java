package OneDay.a2021_2;

/*1052
今天，书店老板有一家店打算试营业 customers.length 分钟。每分钟都有一些顾客（customers[i]）会进入书店，所有这些顾客都会在那一分钟结束后离开。

        在某些时候，书店老板会生气。 如果书店老板在第 i 分钟生气，那么 grumpy[i] = 1，否则 grumpy[i] = 0。 当书店老板生气时，那一分钟的顾客就会不满意，不生气则他们是满意的。

        书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续 X 分钟不生气，但却只能使用一次。

        请你返回这一天营业下来，最多有多少客户能够感到满意的数量。
         

        示例：

        输入：customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
        输出：16
        解释：
        书店老板在最后 3 分钟保持冷静。
        感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.
         

        提示：

        1 <= X <= customers.length == grumpy.length <= 20000
        0 <= customers[i] <= 1000
        0 <= grumpy[i] <= 1*/


import java.util.Map;

public class a2_23 {

    public static void main(String[] args) {
        int[] a={1,0,1,2,1,1,7,5};
        int[] b={0,1,0,1,0,1,0,1};
        System.out.println(maxSatisfied(a,b,3));

    }


    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int i=0;
        int earn = 0;  //由于抑制脾气净赚的
        int max_earn = 0;
        //滑窗找在哪个区间使用抑制技能净赚最多
        while(i<customers.length)
        {
            if(i<X)
            {
                if(grumpy[i]==1) earn+=customers[i];
            }
            else
            {
                max_earn = Math.max(earn, max_earn);
                if(grumpy[i-X]==1) earn-=customers[i-X];
                if(grumpy[i]==1) earn+=customers[i];
            }
            i++;
        }
        max_earn = Math.max(earn, max_earn);
        //净赚加上原来的
        for(int j=0;j<grumpy.length;j++)
        {
            if(grumpy[j]==0) max_earn+=customers[j];
        }
        //就是结果
        return max_earn;
    }

}
