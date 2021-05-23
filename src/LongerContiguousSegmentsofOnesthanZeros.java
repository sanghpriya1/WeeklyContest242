
public class LongerContiguousSegmentsofOnesthanZeros {
	public static void main(String[] args) {
		String s = "110100010";
		int length = s.length();
		int zeroSeqs = 0;
		int oneSeqs = 0;
		boolean ans = false;
		int i = 0;
		while (i < length) {
			if (s.charAt(i) == '1') {
				int oneSeq = 1;
				i++;
				
				while (i < length && s.charAt(i) == '1') {
					oneSeq++;
					i++;
				}
				oneSeqs = Math.max(oneSeqs, oneSeq);
			} else if (s.charAt(i) == '0') {
				int zeroSeq = 1;
				i++;
				
				while (i < length && s.charAt(i) == '0') {
					zeroSeq++;
					i++;
				}
				zeroSeqs = Math.max(zeroSeqs, zeroSeq);
			}
		}
		if (oneSeqs > zeroSeqs) {
			ans = true;
			System.out.println(ans);
		} else
			System.out.println(ans);
	}

}
