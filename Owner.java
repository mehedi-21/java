
package Mypackage;


final public class Owner {
    
    int cash  ;
    
    Shopkeeper s = new Shopkeeper();
    
    void totalCash(){
        
        s.todaySell() ;
        s.todayDue();
        
        cash = s.sell - s.due ;
        
        System.out.println("total cash : " +cash);
        
    }
    
    
    
}
