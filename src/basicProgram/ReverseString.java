package basicProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Accenture";
		String str2= " ";
		
		int count = str1.length();
		System.out.println(count);
		
		for (int i = count-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}

		System.out.println(str2);
	}

}
