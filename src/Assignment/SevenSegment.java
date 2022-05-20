package Assignment;

public class SevenSegment {

    public static String[][] digit = new String[5][4];

    public static void setSpace() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "  ";
            }
        }
    }

    public static void setA() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public static void setB() {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public static void setC() {
        for (int i = 2; i < 5; i++) {
            for (int j = 3; j < 4; j++) {
                digit[j][j] = "* ";
            }
        }
    }

    public static void setD() {
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public static void setE() {
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public static void setF() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public static void setG() {
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public static void displaySegment(String input) {
        setSpace();
        if (input.charAt(7) == '1') {


            if (input.charAt(0) == '1'){
                setA();
            } if (input.charAt(1) == '1'){
                setB();
            } if (input.charAt(2) == '1'){
                setC();
            } if (input.charAt(3) == '1'){
                setD();
            } if (input.charAt(4) == '1'){
                setE();
            } if (input.charAt(5) == '1'){
                setF();
            } if (input.charAt(6) == '1'){
                setG();
            }
        }
    }

    public static void showSegment(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(digit[i][j]);
            }
            System.out.println();
        }
    }
}
