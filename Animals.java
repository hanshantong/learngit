public class Animals {
	private static List<Animal> animals = new ArrayList<>();
	
	public static void addAnimal(Animal a) {
		animals.add(a);
	}
	
	public static void removeAnimal(Animal a) {
		animals.remove(a)
	}
	
	public static void clearAll() {
		for(Animal a : animals) {
			animals.remove(a);
		}
	}
}