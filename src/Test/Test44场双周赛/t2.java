package Test.Test44场双周赛;

import java.util.ArrayList;
import java.util.List;

/*5646
在一个由 m 个用户组成的社交网络里，我们获取到一些用户之间的好友关系。两个用户之间可以相互沟通的条件是他们都掌握同一门语言。

        给你一个整数 n ，数组 languages 和数组 friendships ，它们的含义如下：

        总共有 n 种语言，编号从 1 到 n 。
        languages[i] 是第 i 位用户掌握的语言集合。
        friendships[i] = [u​​​​​​i​​​, v​​​​​​i] 表示 u​​​​​​​​​​​i​​​​​ 和 vi 为好友关系。
        你可以选择 一门 语言并教会一些用户，使得所有好友之间都可以相互沟通。请返回你 最少 需要教会多少名用户。

        请注意，好友关系没有传递性，也就是说如果 x 和 y 是好友，且 y 和 z 是好友， x 和 z 不一定是好友。


        示例 1：

        输入：n = 2, languages = [[1],[2],[1,2]], friendships = [[1,2],[1,3],[2,3]]
        输出：1
        解释：你可以选择教用户 1 第二门语言，也可以选择教用户 2 第一门语言。
        示例 2：

        输入：n = 3, languages = [[2],[1,3],[1,2],[3]], friendships = [[1,4],[1,2],[3,4],[2,3]]
        输出：2
        解释：教用户 1 和用户 2 第三门语言，需要教 2 名用户。


        提示：

        2 <= n <= 500
        languages.length == m
        1 <= m <= 500
        1 <= languages[i].length <= n
        1 <= languages[i][j] <= n
        1 <= u​​​​​​i < v​​​​​​i <= languages.length
        1 <= friendships.length <= 500
        所有的好友关系 (u​​​​​i, v​​​​​​i) 都是唯一的。
        languages[i] 中包含的值互不相同。*/


/*

11
        [[3,11,5,10,1,4,9,7,2,8,6],[5,10,6,4,8,7],[6,11,7,9],[11,10,4],[6,2,8,4,3],[9,2,8,4,6,1,5,7,3,10],[7,5,11,1,3,4],[3,4,11,10,6,2,1,7,5,8,9],[8,6,10,2,3,1,11,5],[5,11,6,4,2]]
        [[7,9],[3,7],[3,4],[2,9],[1,8],[5,9],[8,9],[6,9],[3,5],[4,5],[4,9],[3,6],[1,7],[1,3],[2,8],[2,6],[5,7],[4,6],[5,8],[5,6],[2,7],[4,8],[3,8],[6,8],[2,5],[1,4],[1,9],[1,6],[6,7]]

*/
public class t2 {
    public static void main(String[] args) {

    }

    public static int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int ans=friendships.length*2;
        List<List<Integer>> l=new ArrayList<>();
        List<List<Integer>> f=new ArrayList<>();

        for (int i = 0; i <languages.length ; i++) {
            List<Integer> tempp=new ArrayList<>();
            for (int j = 0; j <languages[i].length ; j++) {
                tempp.add(languages[i][j]);
            }
            l.add(tempp);
        }
        for (int i = 0; i <friendships.length ; i++) {
            List<Integer> tempp=new ArrayList<>();
            for (int j = 0; j <friendships[i].length ; j++) {
                tempp.add(friendships[i][j]);
            }
            f.add(tempp);
        }

        for (int k = 1; k <=n ; k++) {
            int temp=0;
            for (int j = 0; j <friendships.length ; j++) {
                Boolean flag=false;
                for (int i = 0; i < l.get(f.get(j).get(0)-1).size();  i++) {
                    for (int m = 0; m <l.get(f.get(j).get(1)-1).size() ; m++) {
                        if(l.get(f.get(j).get(0)-1).get(i)==l.get(f.get(j).get(1)-1).get(m)){
                            flag=true;
                        }
                    }
                }
                if(!flag){
                    if(l.get(f.get(j).get(0)-1).indexOf(k)==-1){
                        l.get(f.get(j).get(0)-1).add(k);
                        temp++;
                    }
                    if(l.get(f.get(j).get(1)-1).indexOf(k)==-1){
                        l.get(f.get(j).get(1)-1).add(k);
                        temp++;
                    }
                }
            }
            if(ans>temp)ans=temp;
        }
        return ans;
    }




}
