package que1;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t = new Thread2();
		Thread t1 = new Thread(t);
		t1.start();

	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread2 is running");
	}

}
