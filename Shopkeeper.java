
package Mypackage;

import java.util.Scanner;


public class Shopkeeper extends Shop {
    
    Scanner scan = new Scanner(System.in) ;
    
    protected int sell ;
    
    
    @Override
    void todaySell(){
        System.out.println("Enter today's sell amount : ");
        this.sell = scan.nextInt() ;
        
    }
    
    @Override
    void todayDue(){
        System.out.println("Enter today's due amount : ");
        super.due = scan.nextInt() ;
        
    }
    
}
