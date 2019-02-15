package Figures;

public class Bishop implements ArrayModification {
    private int x;
    private int y;

    public Bishop(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void modifyArray(int arr[][]) {
        if (y>=x&&y<arr.length-x){
            int substractionYX=y-x;
            for (int i=0;i<arr.length-substractionYX;i++){
                int j=i+substractionYX;
                arr[i][j]=1;
            }
            for (int i=0;i<arr.length-substractionYX+1;i++){
                int j=arr.length-substractionYX-i;
                arr[i][j]=1;
            }
        }else if ((y>=x)&&(y>=arr.length-x)){
            int substractionXY=x-(arr.length-1-y);
            for (int j=arr.length-1;j>=substractionXY;j--){
                int i=arr.length-j+substractionXY-1;
                arr[i][j]=1;
            }
            int substractYX=y-x;
            for (int i=0;i<arr.length-substractYX;i++){
                int j=i+substractYX;
                arr[i][j]=1;
            }
        }else if ((x>y)&&(x<=arr.length-y)){
            int substractionXY=x-y;
            for (int j=0;j<arr.length-substractionXY;j++){
                int i=substractionXY+j;
                arr[i][j]=1;
            }
            int addXY=x+y;
            for (int i=0;i<=addXY;i++){
                int j=addXY-i;
                arr[i][j]=1;
            }
        }

    }

    int getY() {
        return y;
    }

    int getX() {
        return x;
    }
}
