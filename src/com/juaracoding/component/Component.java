package com.juaracoding.component;

public class Component {
	private long pinjemWoi;
	private double jmlAngsur;
	private double bunga;
	
	public Component() {
		
	}
	
//	===========================================================
	
	public double AngsuranPokok() {
		return 0.0;
	}
	public double AngsuranBunga() {
		return 0.0;
	}
	public double BesarAngsuran() {
		return 0.0;
	}
	public double SisaPinjamanPokok() {
		return 0.0;
	}
	
	
//	===========================================================
	
	
	public long getPinjemWoi() {
		return pinjemWoi;
	}

	public void setPinjemWoi(long pinjemWoi) {
		this.pinjemWoi = pinjemWoi;
	}

	public double getJmlAngsur() {
		return jmlAngsur;
	}

	public void setJmlAngsur(double jmlAngsur) {
		this.jmlAngsur = jmlAngsur;
	}

	public double getBunga() {
		return bunga;
	}

	public void setBunga(double bunga) {
		this.bunga = bunga;
	}
	

}
