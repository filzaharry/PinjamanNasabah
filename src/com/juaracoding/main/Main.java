package com.juaracoding.main;

import java.util.Scanner;

import com.juaracoding.pinjaman.PinjamanNasabah;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		PinjamanNasabah pn = new PinjamanNasabah();
		System.out.print("Masukkan Pinjaman : ");
		Integer pw = sc.nextInt();
		System.out.print("Masukkan Jumlah Angsuran : ");
		Integer ja = sc.nextInt();
		System.out.print("Masukkan Bunga dalam Desimal : ");
		Double bu = sc.nextDouble();
		pn.setPinjemWoi(pw);
		pn.setJmlAngsur(ja);
		pn.setBunga(bu);
		pn.LoopAngsuran();
	}

}
