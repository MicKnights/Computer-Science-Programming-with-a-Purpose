package hello;

public class CMYKtoRGB {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double x1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double x3 = Double.parseDouble(args[3]);

        double white = 1 - x3;
        
        double red = 255 * white * (1 - x);
        double green = 255 * white * (1 - x1);
        double blue = 255 * white * (1 - x2);
        
        System.out.printf("red   = %.0f\ngreen = %.0f\nblue  = %.0f\n", red, green, blue);

    }
}
