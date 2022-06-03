package temp2;

public class Application2 implements Runnable {

	public static void main(String[] args) {
		Thread.currentThread().setName("application_2");
		System.out.println("Started application 2.... ");
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done application 2.... ");

		Thread t = new Thread(new Application2());
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Thread is running");

	}
}
