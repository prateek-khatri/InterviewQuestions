
public class StringMatchging {

	
	static int position =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcaabcbabcc";
		String T="abc";
	    StringBuilder strb= new StringBuilder(str);
	  	
		recusrion(strb, T);
		System.out.println(StringMatchging.position);
		
		
		

	}

	private static void recusrion(StringBuilder  strb, String t) {
		
		int k=0;
		if((k=strb.indexOf(t))==-1)
		{
			return ;
		}
		else
		{
			position++;

		strb= strb.delete(k,k+t.length());
		System.out.println(" string " + strb.toString());
		System.out.println(StringMatchging.position);
		recusrion(strb, t);
		}
		
		// TODO Auto-generated method stub
		
	}

}
