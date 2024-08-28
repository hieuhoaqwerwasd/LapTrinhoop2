package phamhieuhoa_23675611;

public class HinhTron {
	private double banKinh;
	private static final double PI=3.1416;
	private Tam t;
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t!=null) {
			this.t = t;
		} else {
			throw new Exception("Loi");
		}
		
	}

	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception {
		if (bk>0) {
			this.banKinh = bk;
		} else {
		throw new Exception("Loi");
	}
	}
	
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		super();
		this.banKinh = banKinh;
		this.t = t;
	}
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	@Override
	public String toString() {
		String m="";
		m+=m.format(", %-3s, %10s, %10s.", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
	
	
}
