
public class Base {
	protected String name;
	protected double size;

	Base() {
		this.name = "몰?루";
	}

	protected void inputNumber() {

	}

	protected void calSize() {

	}

	protected void printSize() {
		System.out.println(this.name + "size : " + this.size);
	}

	public void doAction() {
		this.inputNumber();
		this.calSize();
		this.printSize();
	}
}
