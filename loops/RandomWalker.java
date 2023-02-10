// package loops;


public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int posX = 0, posY = 0;
        int steps = 0;
        double dir = 0;
        
        System.out.printf("(%d, %d)\n", posX, posY);
        do {
            dir = Math.random();
            if (dir <= 0.25) {
                posY++;
            } else if (dir <= 0.50) {
                posX++;
            } else if (dir <= 0.75) {
                posY--;
            } else if (dir <= 1.00) {
                posX--;
            }
            System.out.printf("(%d, %d)\n", posX, posY);
            steps++;
        } while (Math.abs(posX) + Math.abs(posY) < r);
        System.out.printf("steps = %d\n", steps);
    }
}
