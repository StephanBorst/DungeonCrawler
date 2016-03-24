package Square;

public class Room extends Square {

	private static final String staticdescription = "Dit is kamer";
	private String description;

	public Room() {
		description = staticdescription;
	}

	public Room(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}