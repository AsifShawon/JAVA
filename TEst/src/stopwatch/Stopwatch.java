package stopwatch;


public class Stopwatch {
	private long startTime, endTime; 
	
	public Stopwatch() {
		startTime = System.nanoTime();
	}
	
	public long getstartTime() {
		return startTime;
	}
	
	public long getendTime() {
		return endTime;
	}
	
	public void start() {
		startTime = System.nanoTime();
	}
	
	public void stop() {
		endTime = System.nanoTime();
	}
	
}
