package mytestjavaapp1;


public class MyMainClass extends MyParentClass{
    
    private String studentNameObj;
    public MyMainClass(String studentName){
        System.out.println(studentName);
        studentNameObj = studentName;
    }

    @Override
    protected void getSubjectName() {
        super.getSubjectName(); 
        sayHello();
        System.out.println(studentNameObj);
        System.out.println("Printing from MyMainClass");
    }
    
    
}
