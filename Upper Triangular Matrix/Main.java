import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 int row, col;
        boolean isUpperTriangular = true;
        //2
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Enter total number of rows : ");
        row = scanner.nextInt();
        //3
    //    System.out.println("Enter total number of columns : ");
        col = scanner.nextInt();
        //4
        int inputArray[][] = new int[row][col];
        //5
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
          //      System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
                inputArray[i][j] = scanner.nextInt();
            }
        }
        //6
    //    System.out.println("You have entered : ");
       
        //7
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if (inputArray[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) {
                break;
            }
        }
        //8
        if(isUpperTriangular){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

	}
}