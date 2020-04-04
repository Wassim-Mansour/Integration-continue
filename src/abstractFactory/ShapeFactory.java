package abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		}

		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;

	}

}
