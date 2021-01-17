package Test.Test224周赛;

public class a01 {
    public int countGoodRectangles(int[][] rectangles) {
        if(rectangles.length==1)return 1;
        int max=0;
        int ans=0;
        for (int i = 0; i < rectangles.length; i++) {
            int min=rectangles[i][0];
            if(min>rectangles[i][1]){
                min=rectangles[i][1];
            }
            if(min>max){
                max=min;
                ans=1;
                continue;
            }
            if(min==max){
                ans++;
            }
        }
        return ans;
    }
}
