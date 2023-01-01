package net.mcnal.mysterya.entity;

public class RankingEntity {
	private String name;
	private int g;
	private int h;
	private int ab;
	private float avg;
	private float ravg;
	private float slg;
	private float obp;
	private int so;
	private int bbb;
	
	public RankingEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
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

	public float getRavg() {
		return ravg;
	}

	public void setRavg(float ravg) {
		this.ravg = ravg;
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

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public int getBbb() {
		return bbb;
	}

	public void setBbb(int bbb) {
		this.bbb = bbb;
	}

	public RankingEntity(String name, int g, int ab, int h, float avg, float ravg, float slg, float obp, int so,
			int bbb) {
		super();
		this.name = name;
		this.g = g;
		this.ab = ab;
		this.h = h;
		this.avg = avg;
		this.ravg = ravg;
		this.slg = slg;
		this.obp = obp;
		this.so = so;
		this.bbb = bbb;
	}
	
}
