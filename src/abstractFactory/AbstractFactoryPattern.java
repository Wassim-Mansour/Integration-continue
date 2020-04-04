package abstractFactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// getshapefactory
		AbstractFactory shapefactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorfactory = FactoryProducer.getFactory("color");

		Shape shape1 = shapefactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapefactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapefactory.getShape("square");
		shape3.draw();
		Color color1 = colorfactory.getColor("RED");
		color1.fill();
		Color color2 = colorfactory.getColor("green");
		color2.fill();
		Color color3 = colorfactory.getColor("blue");
		color3.fill();
	}

}
