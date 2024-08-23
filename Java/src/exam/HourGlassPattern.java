package exam;

public class HourGlassPattern {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12,13},
                {14,15,16,17,18,19,20},
                {21,22,23,24,25,26,27},
                {28,29,30,31,32,33,34},
                {35,36,37,38,39,40,41}
        };
        printHourGlass(matrix);
    }

    public static void printHourGlass(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows-1; i++) {
            for(int j=0; j<cols-1; j++) {
                if(isValidHourGlass(matrix, i, j)) {
                    printHour(matrix, i, j);
                    System.out.println();
                }
            }
        }
    }

    public static boolean isValidHourGlass(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return (row > 0 && row  < rows - 1 && col > 0 && col < cols - 1);
    }

    public static void printHour(int[][] matrix, int row, int col) {

        // Print top row of the hour glass
        System.out.print(matrix[row-1][col-1]+" ");
        System.out.print(matrix[row-1][col]+" ");
        System.out.print(matrix[row-1][col+1]+"\n");

        // Print the middle of the row
        System.out.print("   " +matrix[row][col]+"\n");

        System.out.print(matrix[row+1][col-1]+" ");
        System.out.print(matrix[row+1][col]+" ");
        System.out.print(matrix[row+1][col+1]+"\n");

    }
}
