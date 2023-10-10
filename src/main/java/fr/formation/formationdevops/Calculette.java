package fr.formation.formationdevops;

public class Calculette {
	
	private double res;
	
	public Calculette() {}
	
	public void add(double a, double b) {
		this.res = a + b;
		System.out.println(res);
	}
	
	public void divide(double a, double b) throws Exception{
		if(b == 0) {
			throw new Exception("on ne divise pas par 0 !!!");
		}
		this.res = a / b;
		System.out.println(res);
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	

}
