package hello;


public class RightTriangle {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int x1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        
        int c = Math.max(x, Math.max(x1, x2));
        int a = Math.min(x, Math.min(x1, x2));
        int b = (x + x1 + x2) - (c + a);

        boolean positive = a > 0 && b > 0 && c > 0;
        boolean isRightTriangle = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        
        System.out.println(positive && isRightTriangle);

    }
}
