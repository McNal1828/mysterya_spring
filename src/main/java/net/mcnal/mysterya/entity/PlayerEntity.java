package net.mcnal.mysterya.entity;

public class PlayerEntity {
	private int numberr;
	private String name;
	private int birth_year;
	private int birth_month;
	private int birth_day;
	private String handed;
	private String element_school;
	private String middle_school;
	private String high_school;
	private String university;
	private String support;
	
	public PlayerEntity() {
		// TODO Auto-generated constructor stub
	}

	public PlayerEntity(int numberr, String name, int birth_year, int birth_month, int birth_day, String handed,
			String element_school, String middle_school, String high_school, String university, String support) {
		super();
		this.numberr = numberr;
		this.name = name;
		this.birth_year = birth_year;
		this.birth_month = birth_month;
		this.birth_day = birth_day;
		this.handed = handed;
		this.element_school = element_school;
		this.middle_school = middle_school;
		this.high_school = high_school;
		this.university = university;
		this.support = support;
	}

	public int getNumberr() {
		return numberr;
	}

	public void setNumber(int numberr) {
		this.numberr = numberr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	public int getBirth_month() {
		return birth_month;
	}

	public void setBirth_month(int birth_month) {
		this.birth_month = birth_month;
	}

	public int getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(int birth_day) {
		this.birth_day = birth_day;
	}

	public String getHanded() {
		return handed;
	}

	public void setHanded(String handed) {
		this.handed = handed;
	}

	public String getElement_school() {
		return element_school;
	}

	public void setElement_school(String element_school) {
		this.element_school = element_school;
	}

	public String getMiddle_school() {
		return middle_school;
	}

	public void setMiddle_school(String middle_school) {
		this.middle_school = middle_school;
	}

	public String getHigh_school() {
		return high_school;
	}

	public void setHigh_school(String high_school) {
		this.high_school = high_school;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}
	
}
