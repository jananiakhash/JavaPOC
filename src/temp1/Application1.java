package temp1;

public class Application1 {

	public static void main(String[] args) {
		Thread.currentThread().setName("application_1");
		System.out.println("Started application 1.... ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done application 1.... ");
	}

}
