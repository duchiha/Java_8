
import java.util.concurrent.ForkJoinPool;

public class TuningPerformance {
	public static void main(String[] args) {

		// You can get the number of processors in your machine using this
		// call: Runtime.getRuntime().availableProcessors()

		System.out.println(Runtime.getRuntime().availableProcessors());

		// The getParallelism() method gets the value from the system property
		// java.util.concurrent. ForkJoinPool.common.parallelism. You can use
		// the System.setProperty
		// method to modify the value of this system property

		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "9");
		System.out.println(ForkJoinPool.commonPool().getParallelism());
	}
}
