public class Chicken implements Animal {
	
	public void sleep() {
		System.out.println("Chicken sleep ...");
	}
	public void eat() {
		System.out.println("Chicken eat ...");
	}
	public void move() {
		System.out.println("Chicken move ...");
	}
	
	public void crow() {
		int step = 1;
		for(int i = 0; i < 1000; ++i) {
			Thread.sleep(1000);
			System.out.println("Chicken crow " + i);
		}

	}
}