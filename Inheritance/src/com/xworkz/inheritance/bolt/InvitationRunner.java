package com.xworkz.inheritance.bolt;

import com.xworkz.inheritance.nut.Card;
import com.xworkz.inheritance.nut.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invitation invite=new Invitation("Marrige",50.55,2000);
		System.out.println(invite.copies);
		System.out.println(invite.price);
		System.out.println(invite.types);
		Card card=new Card("House warming",25.25,1000);
		System.out.println(card.copies);
		System.out.println(card.price);
		System.out.println(card.types);

	}

}
