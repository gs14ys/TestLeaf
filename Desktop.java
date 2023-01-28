package week3.class28thJan.Assignment4;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The desktop size is Medium");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();
	}
}
