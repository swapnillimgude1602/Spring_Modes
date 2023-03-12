package requiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;

}
