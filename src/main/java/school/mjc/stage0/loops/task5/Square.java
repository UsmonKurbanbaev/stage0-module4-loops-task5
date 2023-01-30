package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 1; i <= sideLength; i++){
            System.out.print("8");
            for (int j = 1; j <= sideLength - 2; j++){
                if(i == 1 || i == sideLength){
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("8");
        }
    }
}
