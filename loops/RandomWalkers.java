// package loops;

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int posX = 0, posY = 0;
        int steps = 0;
        double average = 0;
        double dir = 0;

        for (int i = 0; i < trials; i++) {
            steps = 0;
            posX = 0;
            posY = 0;
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
                steps++;
            } while (Math.abs(posX) + Math.abs(posY) < r);
            average += steps;

        }
        System.out.println("average number of steps = " + (average/trials));
    }
}
