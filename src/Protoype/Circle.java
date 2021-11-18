package Protoype;

public class Circle extends Shape {

	public Circle() {
		this.type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("This is Circle");

	}

}