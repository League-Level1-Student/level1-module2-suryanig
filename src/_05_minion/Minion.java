package _05_minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String master) {
		// TODO Auto-generated method stub
		this.master = master;
	}

	public String getMaster() {
		// TODO Auto-generated method stub
		return master;
	}
}
