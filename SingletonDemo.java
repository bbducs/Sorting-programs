
public class SingletonDemo {

	private static SingletonDemo single_instance = null;

	static String name;

	private SingletonDemo() {
		name = " Singleton";
	}

	public static SingletonDemo getInstance() {
		if (single_instance == null) {
			single_instance = new SingletonDemo();
		}
		return single_instance;
	}
}
