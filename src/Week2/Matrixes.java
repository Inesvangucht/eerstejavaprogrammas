package Week2;

/**
 * OEFENING 4: MATRIXES
 * - bepaal twee matrixen adhv arrays (2d)
 * - vermenigvuldig deze twee ->
 */

public class Matrixes {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 0},
                {2, 3, 4},
        };

        int[][] b = {
                {1, 2},
                {3, 2},
                {1, 4},

        };

        int[][] c = mul(a, b);
    }

    private static int[][] mul(int[][] a, int[][] b) {

        if (a[0].length == b.length) {
            System.out.println(b.length);
            System.out.println("OK");
        } else {
            return null;
        }
        int[][] p = new int[a.length][b.length];


        return p;
    }
}
