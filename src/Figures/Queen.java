package Figures;

public class Queen extends Bishop {
    public Queen(int x, int y){
        super(x,y);
    }
    @Override
    public void modifyArray(int[][] arr) {
        // Queen was extended behavior of bishop and put his unique behavior for this method
        super.modifyArray(arr);
        for (int i=0;i<arr.length;i++){
            arr[i][getY()]=1;
        }
        for (int j=0;j<arr.length;j++){
            arr[getX()][j]=1;
        }
    }
}
