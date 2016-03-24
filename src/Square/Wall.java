package Square;

public class Wall extends Square {

	private static final String staticdescription = "Dit is een muur, ga terug";
	private String description;

	public Wall() {
		description = staticdescription;
	}

	public Wall(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}
