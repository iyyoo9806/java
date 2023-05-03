package Quiz;
public class Base {
	protected String name;
	protected double size;

	Base() {
		this.name = "몰?루";
	}
	protected void printName() {
		System.out.println(this.name);
	}

	protected void randomNumber() {

	}

	protected void calSize() {

	}

	protected void printSize() {
		System.out.println(this.name + "size : " + this.size);
	}

	public void doAction() {
		this.printName();
		this.randomNumber();
		this.calSize();
		this.printSize();
	}
}
