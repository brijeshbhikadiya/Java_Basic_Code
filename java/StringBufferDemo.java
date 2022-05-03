/*
brijesh hareshbhai bhikadiya 
*/

class StringBufferDemo
{
	public static void main(String args[])
	{
		//String sb="hello lj sarkhej";//
		StringBuffer sb=new StringBuffer();
	
		System.out.println(" intial capacity is="+sb.capacity());
		System.out.println("append is="+sb.append("hello lj"));
		System.out.println("after capacity is="+sb.capacity());
		
		
		System.out.println("length is="+sb.length());
		
		System.out.println("insert is is="+sb.insert(3,"brijesh"));
		
		
		System.out.println("replace is is="+sb.replace(3,6,"banti"));
		
		
		System.out.println("delete is is="+sb.delete(3,6));
		
		
		System.out.println("return character is is="+sb.charAt(5));
		
		StringBuffer sb1=sb.reverse();
		System.out.println("reverse is="+sb1.reverse());
		System.out.println("reverse is="+sb.reverse());
		
		
		System.out.println("substring is="+sb.substring(3));
		
		
		System.out.println("substring is="+sb.substring(3,5));
	}
}