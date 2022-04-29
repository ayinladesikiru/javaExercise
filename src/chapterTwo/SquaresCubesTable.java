package chapterTwo;

public class SquaresCubesTable {
    public static void main(String[] args) {
        System.out.println("number\t squares \t cubes");
        for(float i = 0; i < 11; i++){
            System.out.println(i+ "     "+ Math.pow(i, 2)+"     "+ Math.pow(i, 3));
        }
    }
        }
