package Week6CodingAssignment;            

public class Card {

	private Integer value;
	private String name;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void describe() {
		System.out.println(name + " " + value);
		
	}

}
