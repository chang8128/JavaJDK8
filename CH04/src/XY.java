public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 3, 5, 7, 9},
            {0, 2, 4, 6, 8, 0}
        };
        for (int x = 0; x < cords.length; x++) {
            for (int y = 0; y < cords[x].length; y++) {
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
           
        }
        System.out.println(cords.length);
        System.out.println(cords[0].length);    
    }

}
