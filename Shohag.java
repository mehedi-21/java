
package newpackage;


public class Shohag extends Father {
    
    private String profession ;
    
    
    @Override
    public void personalInfo(){
        System.out.printf("I am shohag,son of Father class\n") ;
        System.out.printf("I was a student\n") ;
    }
    
    public void personalInfo(String prof){
        profession = prof ;
        
        System.out.println("Now I am an " + this.profession) ;
    }
    
}
