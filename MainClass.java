public class MainClass{ 
    public static void main(String[] args) {

        myStaticMethod(); 

        MainClass myObj = new MainClass(); 
        myObj.myPublicMethod(); 
        
    }

    static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {  
    System.out.println("Public methods must be called by creating objects");
    }

}