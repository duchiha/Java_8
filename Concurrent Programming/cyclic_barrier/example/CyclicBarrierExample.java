
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

// The run() method in this thread should be called only when 
// two players are ready to start the game 
class TennisGame extends Thread {
	public void run() {
		System.out.println("All players ready, game starts \n Love all...");
	}
}

// This thread simulates arrival of a player.
// Once a player arrives, he/she should wait for his opponent to arrive
class Player extends Thread {
	CyclicBarrier waitPoint;

	public Player(CyclicBarrier barrier, String name) {
		this.setName(name);
		waitPoint = barrier;
		this.start();
	}

	public void run() {
		System.out.println("Player " + getName() + " is ready ");
		try {
			waitPoint.await(); // await for all players to arrive
		} catch (BrokenBarrierException | InterruptedException exception) {
			System.out.println("An exception occurred while waiting... " + exception);
		}
	}
}

// Creates a CyclicBarrier object by passing the number of threads and the
// thread to run
// when all the threads reach the barrier
class CyclicBarrierExample {
	public static void main(String[] args) {
		// A tennis game requires two  players;
		// so wait for two players
		// (i.e., two threads) to join to start the game
		System.out.println("Reserving tennis court \n" + "As soon as two players arrive, game will start!");
		CyclicBarrier barrier = new CyclicBarrier(2, new TennisGame());
		new Player(barrier, "Roger Federer");
		new Player(barrier, "Rafael Nadal");
	}
}
