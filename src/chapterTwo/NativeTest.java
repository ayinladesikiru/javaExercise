package chapterTwo;

public class NativeTest {

 public static void main (String[] args) {
 
    Native heck = new Native();
    
    System.out.println("The initial name value " + heck.getName());
    System.out.println("The initial Scv value is " +  heck.getScv100());
    
    
    heck.setName("Akeem Dream");
    heck.setScv(1000);
    
    System.out.println("The new name value " + heck.getName());
    System.out.println("The new Scv value is " +  heck.getScv100());
    
 
 }


}
