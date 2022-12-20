package com.xworkz.javacollection.boot;

import java.util.Collection;
import java.util.LinkedHashSet;

public class MallRunner {

	public static void main(String[] args) {
		String mall1="Orian";
		String mall2="Nexaus";
		String mall3="Global";
		String mall4="GT";
		String mall5="Mantri Squre";
		String mall6="Royal Meenakshi ";
		String mall7="Gopalan ";
		String mall8="The Forum ";
		String mall9="Phoenix Market ";
		String mall10="Banglore centrel ";
		String mall11="The collection ";
		String mall12="Garuda mall ";
		String mall13="Inorbit ";
		String mall14="Leela gorilla ";
		String mall15="Cosmos ";
		String mall16="Total mall";
		String mall17="The forum value WhiteField ";
		String mall18="Park Squre ";
		String mall19=" Orion Avenue";
		String mall20="Elements Mall ";
		String mall21=" Ascendas Park Squre";
		String mall22="1 mg ";
		String mall23="VR Banglore ";
		String mall24="Esteem mall ";
		String mall25="Brookefiled ";
		String mall26="Vega city ";
		String mall27="ETA Namma ";
		String mall28="Jaivika ";
		String mall29="Ajaz Ahmed ";
		String mall30="Bharatiya mall ";
		String mall31="Miraj ";
		String mall32="Vishal mega Mart ";
		String mall33="D mart ";
		String mall34="PVR ";
		String mall35="Metro mall ";
		String mall36="Tibate ";
		String mall37="Orchid mall ";
		String mall38="Sapna mall ";
		String mall39="Relience Mega mart ";
		String mall40="Dektalan ";
		
		Collection<String> collection=new LinkedHashSet<String>();
		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);
		System.out.println(collection.size());
		collection.add(mall11);
		collection.add(mall12);
		collection.add(mall13);
		collection.add(mall14);
		collection.add(mall15);
		collection.add(mall16);
		collection.add(mall17);
		collection.add(mall18);
		collection.add(mall19);
		collection.add(mall20);
		collection.add(mall21);
		collection.add(mall22);
		collection.add(mall23);
		collection.add(mall24);
		collection.add(mall25);
		collection.add(mall26);
		collection.add(mall27);
		collection.add(mall28);
		System.out.println(collection.size());
		collection.add(mall29);
		collection.add(mall30);
		collection.add(mall31);
		collection.add(mall32);
		collection.add(mall33);
		collection.add(mall34);
		collection.add(mall35);
		collection.add(mall36);
		collection.add(mall37);
		collection.add(mall38);
		collection.add(mall39);
		collection.add(mall40);
		System.out.println("Size befor clearing mall-"+collection.size());
		collection.clear();
		System.out.println("Size after clearing mall-"+collection.size());

	}

}
