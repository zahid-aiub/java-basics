package thread;

/*
 * It's a example of Multi-threading concept with
 * run method. 
 * 
 * */

class Hi extends Thread {

	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {

	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		System.out.println("In main Thread");
		System.out.println("----------------------");
		Hi hiObj = new Hi();
		Hello helloObj = new Hello();
		
//		hiObj.printHi();
//		helloObj.printHello();
		
		hiObj.start();
		try{ Thread.sleep(50);} catch (Exception e) { }
		helloObj.start();
		
	}

}
