package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int i = 1; i <= height; i++) {
            System.out.print("8");
            for (int j = 1; j <= length - 2; j++) {
                if (i == 1 || i == height) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("8");
        }
    }
}
