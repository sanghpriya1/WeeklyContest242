
public class MinimumSpeedtoArriveonTime {
	public static void main(String[] args) {
		int[] dist = {1, 1, 100000};
		double hour = 2.1;
		int hours = (int)hour;
		int sum = 0;
		
		for(int i = 0; i < dist.length; ++i) {
			sum += dist[i];
			
		}
		double speed = sum / hours;
		int ans = (int)speed;
		int i = 0;
		int length = dist.length;
		
		while(i < length && hour > 0) {
			double x = (dist[i++] / speed);
			if(hour > 1) {
				hour -= Math.ceil(x);
			}
			else if(hour < 1 && i == length) {
				hour -= x;
			}
			else ans = -1;
		
		}
		System.out.println(ans);
	}

}
