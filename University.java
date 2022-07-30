
package Abstraction;

public class University {
    
    private String name = "Rahim" ;
    
    private String check(){
        
        if (name == new Student().myName){
            return "Registration Successfully completed";
            
        }
            
        else return null;
        
    }
    
    public void registration(){
        check() ;
        
        System.out.println(check());
    }
    
}
