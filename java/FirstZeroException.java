class Zero extends Exception 
{ 
 Zero() 
 { 
 System.out.println("Zero Exception Generated"); 
 } 
} 
class pb3 
{ 
 public static void main(String args[]) 
 { 
 System.out.println("***Exception Demo***"); 
 try 
 { 
 if (Integer.parseInt(args[0])==0) 
 throw new Zero(); 
 } 
 catch(Zero z) 
 { 
 System.out.println("Please give some another number"); 
 } 
 } 
} 
