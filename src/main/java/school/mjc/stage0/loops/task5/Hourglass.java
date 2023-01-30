package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i += 2) {
            for (int k = 1; k <= i / 2; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= height; j++) {
                System.out.print("8");
            }
            System.out.println();
    }
        for(int i = height; i >= 1; i -=2) {
        for (int k = 1; k <= (i -1) / 2; k++) {
            System.out.print(" ");
        }
        for (int j = i; j <= height; j++) {
            System.out.print("0");
        }
        System.out.println();
    }

}
    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();

        hourglass.printHourglassOfGivenSize(8);
    }
}
