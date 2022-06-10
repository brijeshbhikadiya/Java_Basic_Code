class pb1 
{ 
 public static void main(String args[]) 
 { 
 try 
 { 
 int n1,n2; 
 n1=Integer.parseInt(args[0]); 
 n2=Integer.parseInt(args[1]); 
 System.out.println("Div result="+n1/n2); 
 } 
 catch(ArithmeticException e) 
 { 
 System.out.println("You cannot divide a number by zero"); 
 } 
 catch(ArrayIndexOutOfBoundsException e) 
 { 
 System.out.println("Please Enter two numbers"); 
 } 
 catch(NumberFormatException e) 
 { 
 System.out.println("NumberFormatException generated"); 
 } 
 } 
} 
