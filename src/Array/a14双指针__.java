package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
给出一个区间的集合，请合并所有重叠的区间。


        示例 1:

        输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
        输出: [[1,6],[8,10],[15,18]]
        解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
        示例 2:

        输入: intervals = [[1,4],[4,5]]
        输出: [[1,5]]
        解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
        注意：输入类型已于2019年4月15日更改。 请重置默认代码定义以获取新方法签名。

         

        提示：

        intervals[i][0] <= intervals[i][1]
*/
public class a14双指针__ {


    public int[][] merge(int[][] intervals) {
       if(intervals.length==0){
           return new int[0][2];
       }
       Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
       List<int[]> list=new ArrayList<int []>();
       int i=0;
       int l=0;
       int r=0;
       int temp=0;
       while (i<intervals.length-1){
            temp=intervals[i][1];
                while (intervals[i+1][0]<=temp){
                    if(intervals[i+1][1]>temp){
                        temp=intervals[i+1][1];
                    }
                    i++;
                    r++;
                    if(i==intervals.length-1)break;
                }
            int [] a={intervals[l][0],temp};
            list.add(a);
            l=r=i+1;
            i++;
            if(i==intervals.length-1){
                int [] b={intervals[l][0],intervals[r][1]};
                list.add(b);
            }
       }
       int[][] ans=new int[list.size()][2];
       for(int k=0;k<list.size();k++){
           ans[k]=list.get(k);
       }
       return ans;
    }
}
