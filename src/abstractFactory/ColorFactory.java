package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();

		}
		if (colorType.equalsIgnoreCase("green")) {
			return new Green();

		}
		if (colorType.equalsIgnoreCase("blue")) {
			return new Blue();

		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
