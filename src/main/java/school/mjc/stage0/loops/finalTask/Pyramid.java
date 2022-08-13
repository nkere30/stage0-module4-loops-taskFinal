package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            for(int k = cathetusLength; k > i; k--) {
                System.out.print("-");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(i - j);
            }
            for(int j = 2; j <= i; j++) {
                        System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(4);
    }
}
