package PhamHa_23680571;

public class Hinhtrom {
	private double bankinh;
	private Tam t;
	
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t!=null) {
			this.t = t;
		}else {
			throw new Exception("Loi");
		}
		
	}
	// Hang thuc
	public static final double PI=3.1416;
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bk) throws Exception {
		if (bk>0) {
			this.bankinh = bk;
		}else {
			throw new Exception("Loi");
		}
		
	}
	// tao ham( constructor)
	public Hinhtrom() {}
	public Hinhtrom(double bankinh) {
		this.bankinh = bankinh;
		this.t = t;
		
	}
	//tinh dien tich va chu vi
	public double getDientich(){
		return getBankinh()*getBankinh()*PI;
	}
	public double getChuvi() {
		return getBankinh()*2*PI;
	}
	//Mau in
	@Override
	public String toString() {
		String m="";
		m+=m.format("%-3s, %10s, %10s", getBankinh(), getChuvi(), getDientich());
		return m;
	}
	public static void main(String[] args) {
		Hinhtrom h1= new Hinhtrom(10);
		System.out.println(h1);
	}
}
	

