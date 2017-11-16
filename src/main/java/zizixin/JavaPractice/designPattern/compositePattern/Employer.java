package zizixin.JavaPractice.designPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zizixin
 * composite pattern
 */
public class Employer {

	private String name;
	
	private String position;
	
	private List<Employer> employers;
	
	/**
	 * @param name
	 * @param position
	 */
	public Employer(String name,String position){
		this.setName(name);
		this.setPosition(position);
		this.employers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}
	
}
