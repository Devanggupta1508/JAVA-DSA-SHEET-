public class SpiralMatrix {

    public static void printSpiralMethod(int[][] arr) {

        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        System.out.println("endRow"+ endRow);
        System.out.println(arr.length);

        while (startRow <= endRow && startCol <= endCol) {

            // Top Row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right Column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom Row
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
            }

            // Left Column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiralMethod(arr);
    }
}