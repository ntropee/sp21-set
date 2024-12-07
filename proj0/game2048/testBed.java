

public class testBed {
    public static void matMake(String[][] args) {
        int[][] mat = new int[2][2];
        mat[0][0] = 1;
        mat[0][1] = 2;
        for (int i = 0; i < 2; i += 1) {
            for (int j = 0; j < 2; j += 1) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    /* public int void newlen(int[][]) {
        return mat.length;
    }
    System.out.println(newlen(mat)) **/
}

