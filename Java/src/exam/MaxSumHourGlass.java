package exam;

public class MaxSumHourGlass {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int maxSum = findMaxHourGlassSum(matrix);
        System.out.println(maxSum);
    }

    private static int findMaxHourGlassSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 1; i < rows - 1; i++) {
            for(int j = 1; j < cols - 1; j++) {
                // Calculate Hour glass sum at the centre
                int sum = calculateHourGlassSum(matrix, i, j);
                // Update Maxsum if Current sum is larger
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    // Method to calculate the Hour glass sum at centre (row, col)
    private static int calculateHourGlassSum(int[][] matrix, int row, int col) {
        return matrix[row-1][col-1] + matrix[row-1][col] + matrix[row-1][col+1] + matrix[row][col]
                + matrix[row+1][col-1] + matrix[row+1][col] + matrix[row+1][col+1];
    }
}
