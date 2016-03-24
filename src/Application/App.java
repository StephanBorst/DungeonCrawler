package Application;

import Square.Square;
import Square.Wall;

public class App {

	public static void main(String[] args) {
		
		Square wall1 = new Wall();
		Square wall2 = new Wall("Dit is een muur met spikes");
		System.out.println(wall1.getDescription());
		System.out.println(wall2.getDescription());

	}

}
