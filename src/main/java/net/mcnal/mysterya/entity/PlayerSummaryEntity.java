package net.mcnal.mysterya.entity;

public class PlayerSummaryEntity {
	private String league_name;
	private String division;
	private int year;
	private int g;
	private int pa;
	private int ab;
	private float avg;
	private int h;
	private int _2b;
	private int _3b;
	private int hr;
	private int so;
	private int bb;
	private int hbp;
	private float slg;
	private float obp;
	private float ops;
	private int number;

	public PlayerSummaryEntity() {
		// TODO Auto-generated constructor stub
	}

	public PlayerSummaryEntity(String league_name, String division, int year, int g, int pa, int ab, float avg,
			int h, int _2b, int _3b, int hr, int so, int bb, int hbp, float slg, float obp, float ops, int number) {
		super();
		this.league_name = league_name;
		this.division = division;
		this.year = year;
		this.g = g;
		this.pa = pa;
		this.ab = ab;
		this.avg = avg;
		this.h = h;
		this._2b = _2b;
		this._3b = _3b;
		this.hr = hr;
		this.so = so;
		this.bb = bb;
		this.hbp = hbp;
		this.slg = slg;
		this.obp = obp;
		this.ops = ops;
		this.number = number;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getPa() {
		return pa;
	}

	public void setPa(int pa) {
		this.pa = pa;
	}

	public int getAb() {
		return ab;
	}

	public void setAb(int ab) {
		this.ab = ab;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int get_2b() {
		return _2b;
	}

	public void set_2b(int _2b) {
		this._2b = _2b;
	}

	public int get_3b() {
		return _3b;
	}

	public void set_3b(int _3b) {
		this._3b = _3b;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getHbp() {
		return hbp;
	}

	public void setHbp(int hbp) {
		this.hbp = hbp;
	}

	public float getSlg() {
		return slg;
	}

	public void setSlg(float slg) {
		this.slg = slg;
	}

	public float getObp() {
		return obp;
	}

	public void setObp(float obp) {
		this.obp = obp;
	}

	public float getOps() {
		return ops;
	}

	public void setOps(float ops) {
		this.ops = ops;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
