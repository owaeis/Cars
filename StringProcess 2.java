public class StringProcess {
    
    
    public static void main (String[] str){
        
        StringProcess input = new StringProcess();
        
        input.missingChar("This is a strange world", 500);
        
    }
    
    
    
    public void missingChar(String stri, int n) {
 
 
        int len = stri.length();

      if (n<=len){
        
        for (int i = 0 ; i< len ; i++){
            
          if ( i != n){
            System.out.println(stri.charAt(i));
          }
        }
      }
      else 
      
        System.out.println("please enter a valid index number.");
  
    }

}