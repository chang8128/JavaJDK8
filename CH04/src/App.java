public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];
        arr2 = arr1;
        for (int value: arr2) {
            System.out.printf("%d", value);
        }
        
        // System.out.printf("%d", arr1.length);
        

    }
}
