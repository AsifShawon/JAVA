package Interface_basic;

public class mis extends School implements basic_scl_rules, advance_rules, teacher_rules{

	public mis(String location, String name, String details) {
		super(location, name, details);
	}

	@Override
	public void dress_code() {
		System.out.println("White shirt + blue pant + black shoes");
	}

	@Override
	public String weekend() {
		return "Friday";
	}

	@Override
	public void rules() {
		
	}

	@Override
	public void teacher_rules() {
		
	}
}
