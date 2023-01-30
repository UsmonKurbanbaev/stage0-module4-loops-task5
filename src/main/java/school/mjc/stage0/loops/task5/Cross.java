package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int print8 = sideLength/2+1;
        for (int i = 1; i <= sideLength; i++) {
            for(int j=1; j<=sideLength; j++){
                if(i==print8 || j==print8){
                    System.out.print("8");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
