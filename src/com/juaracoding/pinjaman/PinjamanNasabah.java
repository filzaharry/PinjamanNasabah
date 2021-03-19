package com.juaracoding.pinjaman;

import com.juaracoding.component.Component;

public class PinjamanNasabah extends Component {

	 public PinjamanNasabah(long pinjemWoi) {
		// TODO Auto-generated constructor stub
		 this.setPinjemWoi(pinjemWoi);
	}
	public PinjamanNasabah() {
		// TODO Auto-generated constructor stub
	}
	
	
	
//	===========================================================

	
	@Override
	public double BesarAngsuran() {
		// TODO Auto-generated method stub
		double v = (this.getPinjemWoi()*(this.getBunga()/12));
		double t = (1+this.getBunga()/12);
		double r = (Math.pow(1-1/t, getJmlAngsur()));
		return (v / r);
	}
	
	@Override
	public double AngsuranBunga() {
		// TODO Auto-generated method stub
		return this.getPinjemWoi()*this.getBunga();
	}
		
	
	@Override
	public double AngsuranPokok() {
		// TODO Auto-generated method stub
		return this.AngsuranBunga()+this.BesarAngsuran();
	}
	
	@Override
	public double SisaPinjamanPokok() {
		// TODO Auto-generated method stub
		return this.getPinjemWoi()-this.AngsuranPokok();
	}
	
	
//	===============================================================================
	
	
	
	public void LoopAngsuran() {
		System.out.println("Pinjaman "+ this.getPinjemWoi());
		System.out.println("Jml Angsuran " + this.getJmlAngsur());
		System.out.println("Bunga convert to double" + this.getBunga());
		System.out.print("   Angsuran Pokok |");
		System.out.print("   Angsuran Bunga |");
		System.out.print("   Besar Angsuran |");
		System.out.print("   SisaPinjamanPokok");
		System.out.println();
		for(int i = 0; i < this.getJmlAngsur(); i++) {
			
//			saya tidak tahu sampai sini
			System.out.println(i+1 +" | "+ this.AngsuranPokok() +" | "+ this.AngsuranBunga() +" | "+ this.BesarAngsuran() +" | "+ this.SisaPinjamanPokok());
		}
	}
	
	 
	 
}
