class pb1 
{ 
 public static void main(String args[]) 
 { 
 int n1,n2; 
 n1=5; 
 n2=0; 
 try 
 { 
 System.out.println("Div result="+n1/n2); 
 } 
 catch(ArithmeticException e) 
 { 
 System.out.println("You cannot divide a number by zero"); 
 } 
 } 
} 