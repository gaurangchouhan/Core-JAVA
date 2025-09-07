public class Array_2D_07 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 11;
        arr1[0][1] = 12;
        arr1[0][2] = 13;
        System.out.println(arr1[0][2]);

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6 }, {7, 8, 9 }};
//        System.out.println(arr2[0].length);

        // Traversal 
        int i = 0;
        while (i<arr2.length){
            int j = 0;
            while (j<arr2[i].length){
                System.out.print(arr2[i][j] + " ");
                j++;
            }
            System.out.println( );
            i++;
        }
    }
}
