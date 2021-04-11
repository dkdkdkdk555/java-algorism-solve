package solve3_referenceType;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86}, 
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int[] arrays : array) {
			for(int i=0; i<arrays.length; i++) {
				sum += arrays[i];
				count++;
			}
		}
		
		avg = (double)sum/count;
		
		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);
	}

}
