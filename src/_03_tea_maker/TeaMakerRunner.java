package _03_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		Cup cup = new Cup();
		TeaBag teabag = new TeaBag(TeaBag.MINT);
		Kettle kettle = new Kettle();
		kettle.boil();
		cup.makeTea(teabag, kettle.getWater());
		
	}
}
