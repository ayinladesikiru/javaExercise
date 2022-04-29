package chapterTwo;

public class DisplayPrint {

    public static void main (String[] args) {
    
    // The %n next to the * makes the next statement jump to next line
    
    System.out.printf(" ****%n ******%n*******%n ******%n ****%n");
    
    // moves the next print statement to new line
    
    System.out.println("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.println("****");
    System.out.println("**");
    
    // displays it side by side 
    
    System.out.print("*");
    System.out.print("***");
    System.out.print("*****");
    System.out.print("****");
    System.out.print("**");
    
    System.out.printf("%s%n%s%n%s%n%s%n", "*", " ***", "*****", " ***", "*");
    
    }

}
