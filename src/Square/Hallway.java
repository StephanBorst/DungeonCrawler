package Square;

public class Hallway extends Square {

	private static final String staticdescription = "Dit is een gang";
	private String description;

	public Hallway() {
		description = staticdescription;
	}

	public Hallway(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}