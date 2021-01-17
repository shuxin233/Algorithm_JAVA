package OneDay;
/*在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。

        请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。

         

        示例 1：



        输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
        输出：true
        示例 2：



        输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
        输出：false
         

        提示：

        2 <= coordinates.length <= 1000
        coordinates[i].length == 2
        -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
        coordinates 中不含重复的点*/

public class a1_17 {
    public static void main(String[] args) {


        double c=5;
        double cc=4;
        if(c>cc){
            System.out.println(111);
        }
        double b=c/cc;
        System.out.println(b);


        int[][] a= {{0,0},{0,2},{0,-1}};

        System.out.println(checkStraightLine(a));
    }


    public static boolean checkStraightLine(int[][] coordinates) {
        int tempX=0;
        int tempY=0;
        for (int i = 0; i < coordinates.length; i++) {
            if(coordinates[i][0]==coordinates[0][0]){
                tempX++;
            }
            if(coordinates[i][1]==coordinates[0][1]){
                tempY++;
            }
        }
        if(tempX==coordinates.length)return true;
        if(tempY==coordinates.length)return true;

        if(coordinates.length==2)return true;
        double a=coordinates[1][1]-coordinates[0][1];
        double b=coordinates[1][0]-coordinates[0][0];
        double k=a/b;

        for (int i = 2; i <coordinates.length ; i++) {
            double c=coordinates[i][1]-coordinates[0][1];
            double d=coordinates[i][0]-coordinates[0][0];
            double l=c/d;
            if(Double.doubleToLongBits(k)==Double.doubleToLongBits(l)){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
