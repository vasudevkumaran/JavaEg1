package mytestjavaapp1;

public class MyParentClass {
    private String subject = "English";
    
    protected void getSubjectName(){
        System.out.println(subject);
        
        showSubject(subject);
    }
    
    public void showSubject(String sub){
    
        System.out.println(sub);
    }
    
    public void sayHello(){
        System.out.println("Hello");
    }
}
