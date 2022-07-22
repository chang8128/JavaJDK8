public class TwoDimensionalArray {
    public static void main(String[] args) {
        // inta[][] = new inta[3][4];
        int[][] arrayTest = new int[][]{
            {1, 2, 3, 4},
            {2, 34, 45, 111},
            {23, 34, 56, 123}
        };

        for (int i = 0; i < arrayTest.length; i++) {
            for (int j = 0; j < arrayTest[i].length; j++) {
                System.out.print(arrayTest[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
