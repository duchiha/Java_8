

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {

			nums.add(i);

		}

		System.out.println("The list before delete " + nums);
		Iterator<Integer> numsIter = nums.iterator();

		while (numsIter.hasNext()) {
			numsIter.next();
			numsIter.remove();

		}

		System.out.println("The list after delete " + nums);
	}

}
