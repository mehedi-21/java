
// Encapsulation

package MyPackage;

public class laptop {
    
    //variable declaration
    double display_size ;
    String processor ;
    String hard_disk ;
    
    //constructor
    laptop(double size,String proc,String space){
        display_size = size ;
        processor = proc ;
        hard_disk = space ;
        
    }
    
    //output method
    void display(){
        System.out.println("Display size = " + display_size);
        System.out.println("Processor = " + processor);
        System.out.println("Hard Disk = " + hard_disk);
    }
    
    public static void main(String[] args){
        
        System.out.println("HP laptop :");
        laptop hp = new laptop (20,"core i3","1TB") ;
        hp.hard_disk = "5TB" ;
        hp.display() ;
        
        System.out.println("ASUS laptop :");
        laptop ASUS = new laptop (22.7,"core i7","2TB") ;
        
        ASUS.display() ;
        
    }
    
    
    
}
