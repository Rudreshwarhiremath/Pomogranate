package com.xworkz.BMTC.Mysore;

import com.xworkz.BMTC.banglore.Song;

public class SongRunner {

	public static void main(String[] args) {
		Song song1 = new Song();
		Song song2 = new Song();
		Song sing = new Song();
		Song sang = new Song();
		Song sung = new Song();
		System.out.println(song1.name);
		System.out.println(song2.langauge);
		System.out.println(sing.singer);
		System.out.println(sang.lyricst);
		System.out.println(sung.type);
		song1.name = "Singar Siriye";
		song2.langauge = "kannada";
		sing.singer = "Vijay Prakash & Ananya Bhata ";
		sang.lyricst = "Pramod Maravanthe";
		sung.type = "Romantic";
		System.out.println(song1.name);
		System.out.println(song2.langauge);
		System.out.println(sing.singer);
		System.out.println(sang.lyricst);
		System.out.println(sung.type);

	}

}
