//ѕрекопирайте един масив от цели числа в друг масив. 
public class Main {
	public static void main(String[] args) {

		int[] numbers1 = new int[] { 1, 2, 3, 4 };
		int[] numbers2 = new int[numbers1.length];

		/*
		 * Copy array.
		 */

		for (int i = 0; i < numbers1.length; i++) {
			numbers2[i] = numbers1[i];
		}
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i] + " " + numbers2[i]);
		}
	}
}
