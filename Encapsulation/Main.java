package Encapsulation;
public class Main {
    public static void main(String[]args){
        Encapsulation myObj= new Encapsulation();

        // myObj.name="John"                    cannot access because the name is private
        // System.out.println(myObj.name);      error

        //set
        myObj.setName("Thaqi");

        //get
        System.out.println(myObj.getName());

    }
}
