package com.java.emailrandomcode.main;

import java.util.Random;

public class Application {
	
	static Random random = new Random();

	public static void main(String[] args) {

		String number = "42692478576846294";
		String sirali ="1234567890";

		System.out.println(mixedNumbers(number));
		System.out.println(mixNumber2(sirali));
	}

	private static String mixedNumbers(String number) {

		
		String sonuc = "";
		for (int i = 1; i < 18; i++) {

			if (i == 8 || i == 13) {

				sonuc += "-";
			} else {
			 

				sonuc += number.charAt(random.nextInt(number.length()));
			}

		}

		return sonuc;

	}
	
	private static String mixNumber2(String sirali) {
		String sonuclar="";
		//toplam kac tane donebýlecegýmýzý burdan ayarlýyoruz
		for(int i = 1; i <= 5;i++) {
			if(i == 3) {
				sonuclar += "-";
				
			}else {
				
				sonuclar += (sirali.charAt(random.nextInt(sirali.length())));
				
				
			}
			
		}
		
		
		
		return sonuclar;
		
		
	}

}
