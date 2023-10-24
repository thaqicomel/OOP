public class Constructor{

    int age;
    String fname;
    String lname;

    public Constructor(int myage, String myfname, String mylname){

        age=myage;
        fname=myfname;
        lname=mylname;

    }
    public static void main(String[]args){
        Constructor obj= new Constructor(22, "Thaqiyuddin","Mizan");
        System.out.println("Age :"+ obj.age +"\n"+ "Name: "+obj.fname+" "+obj.lname);
        
    }

}
