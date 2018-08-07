public class Chicken implements Animal {
	public void crow() {
		int step = 1;
		for(int i = 0; i < 1000; ++i) {
			Thread.sleep(1000);
			System.out.println("Chicken crow " + i);
		}

	}
}