package Array;

import java.util.Random;

public class RandomNoGenerate {

	public static void main(String[] args) {
		Random ran=new Random();
		int rand=ran.nextInt(10000);
		System.out.println(rand);
		double rand_doub=ran.nextDouble(100);
			System.out.println(rand_doub);
	}

}
