package inner_classes;

public class Singltone {
	private static Singltone singleInstance = null;
	public String s;

	private Singltone() {
		s = "Single tone class constructor string.";
	}

	public static synchronized Singltone getInstance() {
		if (singleInstance == null)
			singleInstance = new Singltone();
		return singleInstance;
	}

	public static void main(String[] args) {
		Singltone a = Singltone.getInstance();
		Singltone b = Singltone.getInstance();
		Singltone c = Singltone.getInstance();
    Singltone s=new Singltone();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(s.hashCode());
	}

}
