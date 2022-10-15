package que1;

public class Thread1 implements Runnable {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Thread1 t = new Thread1();
		Thread t1 = new Thread(t);
		t1.start();

	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread1 is running");
		
	}

}
