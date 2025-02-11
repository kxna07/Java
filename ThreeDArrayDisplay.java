package arrays;

class ThreeDArrayDisplay {
    public static void main(String[] args) {
        // Declaring and Initializing a 3D Array
        int[][][] arr = {
            { {1, 2, 3}, {4, 5, 6} },
            { {7, 8, 9}, {10, 11, 12} }
        };

        // Displaying the 3D Array
        System.out.println("3D Array Elements:");
        for (int i = 0; i < arr.length; i++) { // Depth
            System.out.println("Depth " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) { // Rows
                for (int k = 0; k < arr[i][j].length; k++) { // Columns
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // Extra line after each depth
        }
    }
}
