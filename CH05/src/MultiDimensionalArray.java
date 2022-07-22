public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][] arrTest = new int[][][] {
            {
                {1, 3, 5},
                {2, 4, 7}
            },
            {
                {23, 45, 56},
                {222, 444, 666}
            },
        };

        // 遍历这个数组
        int sum = 0;
        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++) {
                for (int k = 0; k < arrTest[i][j].length; k++) {
                    System.out.print(arrTest[i][j][k] + " ");
                    sum += arrTest[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
