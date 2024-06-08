public class LeetCode2545 {
    public static int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++){
            
        }
    }

    public static void main(String[] args) {
        int[][] score=[[10,6,9,1],[7,5,11,2],[4,8,3,15]];
        int k=2;
        score=sortTheStudents(score, k);
        for(int i=0;i<score;i++)
            for(int j=0;j<score[i].length;j++){
                System.out.print(score[i][j]+" ");
            System.out.println();
        }
    }
}
