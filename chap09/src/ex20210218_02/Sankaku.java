package ex20210218_02;

public class Sankaku {
	double teihen;
	double takasa;

	public Sankaku(double teihen,double takasa) {
		this.teihen=teihen;
		this.takasa=takasa;
	}
	public double menseki() {
		double menseki=this.teihen*this.takasa/2;
		return menseki;
	}
}
