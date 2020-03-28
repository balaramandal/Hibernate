package corepractice;

public class SwapWithoutTemp { 
	
    public static void main(String args[]) {  
        String a = "Love";  
        
       /* String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  */
        
        a.concat("you");
        System.out.println("string : "+a);
        
        StringBuilder build = new StringBuilder("rishi");
        build.append("raj");
        
        System.out.println("Example of StringBuilder: "+build);
        
        StringBuffer buff = new StringBuffer("Rishi");
        buff.append(" Bsdk");
        
        System.out.println("Example of StringBuffer: "+buff);
        
    }  
}  