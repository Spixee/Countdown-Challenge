package code.diegofc.base;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import code.diegofc.base.countdown.Utility;

public class Main {

	public static void main(String[] args) {
		// countdown
		IO.println("HELLO Countdown Challenge!!!");
		IO.println("++++++++++++++++++++++++++");		
		IO.println(System.lineSeparator());

//		int target = 765;
//		List<Integer> numbers = List.of(1, 3, 7, 10, 25, 50);

//		int target = 888;
//		List<Integer> numbers = List.of(100, 2, 75, 3, 1, 10);

		int target = 931;
		List<Integer> numbers = List.of(100, 2, 75, 3, 9, 25);

		// uniqueness check
		try {
			Set.of(numbers.toArray());
		} catch (IllegalArgumentException iae) {
			System.err.println(iae);
			System.exit(2);
		}

		IO.println(String.format("The 6 number set: %s", numbers.toString()));
		IO.println(String.format("The target number: %d", target));
		IO.println(System.lineSeparator());		
		
		var start = System.currentTimeMillis();
		AtomicInteger counter = new AtomicInteger(0);

		Utility.solutions(numbers, target).forEach(e -> {
			int currentCount = counter.incrementAndGet();
			IO.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			IO.println(String.format("%d => %s = %d", currentCount, e, target));
		});
		IO.println(System.lineSeparator());
		IO.println("++++++++++++++++++++++++++");
		System.out.println(String.format("Time taken (ms): %d", (System.currentTimeMillis() - start)));
		System.out.println(String.format("Number of solutions: %s", counter.toString()));
	}
}
