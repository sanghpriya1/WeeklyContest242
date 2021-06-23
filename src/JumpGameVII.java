
public class JumpGameVII {
	public static void main(String[] args) {
		String s ="01";
		int minJump = 1; int maxJump = 1;
		int i = 0;
		boolean ans  = true;
		while(i < s.length()-1) {
			int j = i + 1; 
			while(j < s.length() && s.charAt(j) != '0')j++;
			if((i + minJump <= j) && (j <= Math.min(i + maxJump, s.length() - 1))){
				i = j;
			}
			else {
				ans  = false;
				break;
			}
		}
		System.out.println(ans);
	}

}
