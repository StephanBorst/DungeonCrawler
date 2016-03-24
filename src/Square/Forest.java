package Square;

public class Forest extends Square {

	private static final String staticdescription = "Dit is bos";
	private String description;

	public Forest() {
		description = staticdescription;
	}

	public Forest(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

}