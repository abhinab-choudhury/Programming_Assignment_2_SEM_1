package HomeAssignment_CLA;

public class A2Q1 {
	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		
		double si = (principle * rate * time) / 100;
		System.out.println("Simple Interest : " + si);
	}
}
