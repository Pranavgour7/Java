public class cwh_28_multi_dim_array {
    public static void main(String[] args) {
        //2-D array
        int[] marks;  //A 1-D array
        int[][] flats; // A 2-D array
        flats = new int[3][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        flats[2][0] = 301;
        flats[2][1] = 302;
        flats[2][2] = 303;
        System.out.print(flats[0].length);

        System.out.println("Printing the 2 - D array using loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}