package mytestjavaapp1;


public class MyTestJavaApp1 {

    public static void main(String[] args) {
        MyTestJavaApp1 myapp = new MyTestJavaApp1();
        myapp.getFirstName();
        //MyParentClass mpc = new MyParentClass();
        //mpc.getSubjectName();
        MyMainClass mmc = new MyMainClass("Kumaran");
        mmc.getSubjectName();
        
    }
    
    private String studentName = "Vasudev";
    private int studentMark = 50;
    private boolean isPassed = false;
    
    private void getFirstName(){
        System.out.println(studentName);
    }
    
}
