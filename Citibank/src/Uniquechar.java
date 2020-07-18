import java.util.Scanner;
public class Uniquechar {

	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//		    String s1 = sc.nextLine();
//		    String s2 = sc.nextLine();
//		    StringBuffer sb1 = new StringBuffer(s1.replace(" ", ""));
//		    StringBuffer sb2 = new StringBuffer(s2);
//		    
//		    System.out.println(sb1);
//		    System.out.println(sb2);
//		  
//		    

				
		String s1="hello";
		String s2="helmjyu";
		char[] s = s1.toCharArray();
		System.out.println(s[3]);
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++)
			{
				if (s1.charAt(i)!=s2.charAt(j)) {
					System.out.println(s1.charAt(i));
			}
	/*		System.out.println(s1.length());
			System.out.println(s1.charAt(4));*/
		}
/*		char c=s1.charAt(0);//return;s h.
		System.out.println("1st character is: "+c);*/

	}

}
}
