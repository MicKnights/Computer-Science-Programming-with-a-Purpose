// package loops;


public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i-j) >= -width && (i-j) <= width) {
                    if (j > 1) {
                        System.out.print(" * ");
                        continue;
                    }
                    System.out.print("* ");
                } else if ((i-j) < -width || (i-j) > width) {
                    if (j > 1) {
                        System.out.print(" 0 ");
                        continue;
                    }
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
