public class Cycle {
	public static void main (String[] args){
		int result = 0;
		for(int i = 0; i <= 20; i++) {
			result=i;
			System.out.println(result);
		}
		int j = 6;
		while (j >= -6){
			System.out.println(j);
			j = j - 2;
		}
		int k = 10;
		int result_2 = 0;
		do {
			if (k % 2 != 0){
				result_2 = result_2+k;
			}
			k++;

		} while (k <= 20);
		System.out.println(result_2);
	}
}
