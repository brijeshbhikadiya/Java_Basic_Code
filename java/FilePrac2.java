import java.io.*; 
class test 
{ 
 public static void main(String[] args) throws Exception 
 { 
 File f = new File("D:/home/abc/bcd/def/ghi/jkl"); 
 f.mkdirs(); 
 File f1 = new File("D:/home/abc/s1.txt"); 
 File f2 = new File("D:/home/abc/s2.txt"); 
 File f3 = new File("D:/home/abc/s3.txt"); 
 f1.createNewFile(); 
 f2.createNewFile(); 
 f3.createNewFile(); 
 File obj = new File("D:/home/abc"); 
 File arr[] = obj.listFiles(); 
 int i; 
 for(i=0;i<arr.length;i++) 
 { 
 System.out.println("Name="+arr[i].getName()); 
 System.out.println("Length="+arr[i].length()); 
 System.out.println("Directory??="+arr[i].isDirectory()); 
 System.out.println("File??="+arr[i].isFile()); 
 System.out.println("CanRead??="+arr[i].canRead()); 
 System.out.println("CanWrite??="+arr[i].canWrite()); 
 System.out.println("\n"); 
 } 
 } 
} 