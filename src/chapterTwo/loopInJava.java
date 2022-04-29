package chapterTwo;

public class loopInJava {
    public static void main(String[] args) {
        for(int i = 0; i < 12; i++){
            for(int j = 0; j <= 5; j++){
                System.out.printf("%d x %d = %d | ", j, i, j * i);
            }
            System.out.println("#############");
        }
    }
}
