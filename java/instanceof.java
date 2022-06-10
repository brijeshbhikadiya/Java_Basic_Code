interface I1 
{ 
 void display(); 
} 
interface I2 
{ 
 void display(); 
} 
interface I3 extends I1,I2 
{ 
 void display();
 } 
interface I4 
{ 
 void display(); 
} 
class X implements I3 
{ 
 public void display() 
 { 
 System.out.println("In class X"); 
 } 
} 
class W extends X implements I4 
{ 
} 
class pb2 
{ 
 public static void main(String args[]) 
 { 
 W w= new W(); 
 w.display(); 
 
 if(w instanceof I1) 
 System.out.println("w is the instance of I1"); 
 if(w instanceof I2) 
 System.out.println("w is the instance of I2"); 
 if(w instanceof I3) 
 System.out.println("w is the instance of I3"); 
 if(w instanceof I4) 
 System.out.println("w is the instance of I4"); 
 } 
}