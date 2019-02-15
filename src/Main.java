import Figures.*;

import java.util.Scanner;

/*
* arr contains only 0's
* when figure is modifing a board then if need it changes the values to 1
* */


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // arr is our chessboard(matrix[8][8])
        int[][]arr=new int[8][8];

        //Initializing bishop and modifing board with method modifyArray()
        System.out.print("Input Bishop x: ");
        int xBishop=sc.nextInt();
        System.out.print("Input Bishop y: ");
        int yBishop=sc.nextInt();
        ArrayModification figure=new Bishop(xBishop,yBishop);
        figure.modifyArray(arr);

        //Initializing WhiteKing and modifing board with method modifyArray()
        System.out.print("Input WhiteKing x: ");
        int xWhiteKing=sc.nextInt();
        System.out.print("Input WhiteKing y: ");
        int yWhiteKing=sc.nextInt();
        figure=new WhiteKing(xWhiteKing,yWhiteKing);
        figure.modifyArray(arr);

        //Initializing Queen and modifing board with method modifyArray()
        System.out.print("Input Queen x: ");
        int xQueen=sc.nextInt();
        System.out.print("Input Queen y: ");
        int yQueen=sc.nextInt();
        figure=new WhiteKing(xQueen,yQueen);
        figure.modifyArray(arr);

        //Initializing Knight and modifing board with method modifyArray()
        System.out.print("Input Knight x: ");
        int xKnight=sc.nextInt();
        System.out.print("Input Knight y: ");
        int yKnight=sc.nextInt();
        figure=new WhiteKing(xKnight,yKnight);
        figure.modifyArray(arr);

        print(arr);

        //Initializing bishop and check mate with method isMate()
        System.out.print("Input BlackKing x: ");
        int xBlackKing=sc.nextInt();
        System.out.print("Input BlackKing y: ");
        int yBlackKing=sc.nextInt();
        BlackKing blackKing=new BlackKing(xBlackKing,yBlackKing);
        blackKing.isMate();
    }
    //for print our board
     static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++)
                System.out.print(arr[i][j]+"  ");
            System.out.println();
        }

    }
}
