package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choise) {

		if (choise.equalsIgnoreCase("shape")) {
			return new ShapeFactory();

		}
		if (choise.equalsIgnoreCase("color")) {
			return new ColorFactory();

		}
		return null;

	}

}
