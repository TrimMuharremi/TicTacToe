public class TicTacToe {
    public static String x = "";
    public static String o = "";

    public static void matrica() {
        int[] m = new int[9];
        TicTac t = new TicTac();
        int player = 0;
        int comp = 0;

        print(m);
        for (int i = 0; i < m.length; i++) {
            comp = t.kompInt();
            boolean b = kontrollo(m, comp);
            while (!b) {
                comp = t.kompInt();
                b = kontrollo(m, comp);

            }
            if (b) {
                m[comp] = 1;
            }
            print(m);
            player = t.playerInt();
            b = kontrollo(m, player);
            while (!b) {
                System.out.println("Vendi eshte i zene");
                player = t.playerInt();
                b = kontrollo(m, player);
            }
            if (b) {
                m[player] = 2;
            }
            print(m);
            if (t.kontrollofitusin(m) == 0) {

            } else {
                if (t.kontrollofitusin(m) == 1) {
                    System.out.println("Fiton kompjuteri");
                } else {
                    if (t.kontrollofitusin(m) == 2) {
                        System.out.println("Fiton Lojtari");
                    }
                }
            }
        }
    }

    public static boolean kontrollo(int[] m, int n) {
        boolean answer = false;
        if (m[n] == 0) {
            answer = true;
        }
        return answer;
    }

    public static void print(int[] a) {
        int[][] m = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = a[i * 3 + j];
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == 0)
                    System.out.print(" [   ] ");
                else {
                    if (m[i][j] == 1) {
                        x = m[i][j] + "X";
                        System.out.print(" [ " + x.substring(1, 2) + " ] ");
                    } else {
                        if (m[i][j] == 2) {
                            o = m[i][j] + "O";
                            System.out.print(" [ " + o.substring(1, 2) + " ] ");
                        }
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        matrica();
    }
}