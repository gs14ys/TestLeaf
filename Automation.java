package week3.class28thJan.Assignment7;

public class Automation extends MultipleLangauge {

	@Override
	public void ruby() {
		System.out.println("ruby");
	}

	public void Java() {
		System.out.println("Java");

	}

	public void Selenium() {
		System.out.println("Selenium");

	}

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.python();
		obj.ruby();
		obj.Java();
		obj.Selenium();

	}

}
