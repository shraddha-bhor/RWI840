//package java program;

public class loop {



	
    public static void main(String[] args) {
       
        
        System.out.println("==main method==");
   }
    
    static {
        
       for(int i=1; i<=5; i++) {
           
           for(int j=1; j<=i; j++) {
               
               System.out.print(j);
           }
          System.out.println();
       }
       
    }
}
