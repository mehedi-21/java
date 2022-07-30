
package newpackage;


public class Main {
    public static void main(String[] args){
        
        // object declaration
        Father f = null ;
        Shohag s = null ;
        Babu b = null ;
        ToaTalha t = null ;
        
        f = new Shohag() ;
        f.personalInfo();   // overridding or run time polymorphism
        
        System.out.println("---------------");
        
        s = new Shohag() ;
        s.personalInfo("Engineer"); // mehod overloading or compile time polymorphism
        
        System.out.println("---------------");
        
        f = new Babu() ;
        f.personalInfo();
        
        System.out.println("---------------");
        
                
    }
    
}
