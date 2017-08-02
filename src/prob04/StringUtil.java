package prob04;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		int length = str.length;
		String result = "";
		
		for (int i=0; i<length; i++) {
			result = result + str[i];
		}
		
		return result;
	}
}
