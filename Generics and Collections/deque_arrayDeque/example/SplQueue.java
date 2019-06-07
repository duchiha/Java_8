
import java.util.ArrayDeque;
import java.util.Deque;

public class SplQueue {

	private Deque<String> splQ = new ArrayDeque<String>();

	void addInQueue(String costumer) {

		splQ.addLast(costumer);

	}

	void RemoveFront() {
		splQ.removeFirst();

	}

	void RemoveBack() {

		splQ.removeLast();
	}

	void PrintQueue() {

		System.out.println("Special Queue contain : " + splQ);
	}

	public static void main(String[] args) {

		SplQueue splQ = new SplQueue();
		splQ.addInQueue("Harrison");
		splQ.addInQueue("McCartney");
		splQ.addInQueue("Starr");
		splQ.addInQueue("Lennon");

		splQ.PrintQueue();
		splQ.RemoveFront();
		splQ.PrintQueue();
		splQ.RemoveBack();
		splQ.PrintQueue();

	}

}
