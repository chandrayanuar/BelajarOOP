package com.juaracoding.main;

public class Kotak extends BidangRuang  implements Ruang2D{
	
	private float nilaiSisi = 0; 
	
	 public Kotak() {
		// TODO Auto-generated constructor stub
	}
	 
	public Kotak(float nilai) {
		
		this.nilaiSisi = nilai;
		
		
	}
	
	@Override
	public void gambarRuang() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Override
	public float luas() {
		// TODO Auto-generated method stub
		return nilaiSisi * nilaiSisi;
	}

	@Override
	public float keliling() {
		// TODO Auto-generated method stub
		return 4 * nilaiSisi;
	}

	public float getNilaiSisi() {
		return nilaiSisi;
	}

	public void setNilaiSisi(float nilaiSisi) {
		this.nilaiSisi = nilaiSisi;
	}
	
	

}
