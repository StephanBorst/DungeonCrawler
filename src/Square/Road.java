package Square;

public class Road extends Square {

	private static final String staticdescription = "Dit is een weg";
	private String description;

	public Road() {
		description = staticdescription;
	}

	public Road(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}