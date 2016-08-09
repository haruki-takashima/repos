package sosuu;

import java.util.stream.LongStream;

public class Sosuu {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		long num = 2147483647;
		// long num = 997;
		// System.out.println(Integer.MAX_VALUE);
		// if (Sosuu.isPrimeNumber(num)) {
		// System.out.println("You are SoSu!!");
		// } else {
		// System.out.println("お前は素数ではないな！");
		// }

		boolean isSosu = true;
		if (num <= 1) {
			isSosu = false;
		} else if (num == 2) {

		} else if (num % 2 == 0) {
			isSosu = false;
		} else {
			for (long i = 2; i + 1 < num; i = i + 2) {
				if (num % (i + 1) == 0) {
					System.out.println(num % (i + 1));
					isSosu = false;
					break;
				}

			}
		}

		if (isSosu == true) {
			System.out.println("You are SoSu!!");
		} else {
			System.out.println("お前は素数ではないな！");
		}

		System.out.println(System.currentTimeMillis() - start);
	}

	public static boolean isPrimeNumber(long number) {
		if (number <= 2) {
			return false;
		}
		return !LongStream.range(3, number).filter(l -> number % l == 0).findFirst().isPresent();
	}

}
