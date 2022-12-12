package com.xworkz.bridge.boot;

import java.lang.annotation.AnnotationTypeMismatchException;

import com.xworkz.bridge.exceptions.Method;

public class MethodRunner {

	public static void main(String[] args) throws Exception {
		Method met = new Method();
		try {
			System.out.println("before");
		met.event1();
		System.out.println("after");
		}catch(RuntimeException e) {
			System.err.println("exception in method1");
		}
		try {
			met.event2();	
		}catch(AnnotationTypeMismatchException a) {
			System.out.println("Exception in method 2");
		}
		
		met.event3();
		met.event4();
		met.event5();
		met.event6();
		met.event7();
		met.event8();
		met.event9();
		met.event10();
		met.event11();
		met.event12();
		met.event13();
		met.event14();
		met.event15();
		met.event16();
		met.event17();
		met.event18();
		met.event19();
		met.event20();
		met.event21();
		met.event22();
		met.event23();
		met.event24();
		met.event25();
		met.event26();
		met.event27();
		met.event28();
		met.event29();
		met.event30();
		met.event31();
		met.event32();
		met.event33();
		met.event34();
		met.event35();
		met.event36();
		met.event37();
		met.event38();
		met.database1();
		met.database2();
		met.database3();
		met.database4();
		met.database5();
		met.database6();
		met.database7();
		met.database8();
		met.database9();
		met.database10();
		met.database11();
		met.database12();
		met.database13();
		met.database14();
		met.database15();
		met.database16();
		met.database17();
		met.database18();
		met.database19();
		met.database20();
		met.database21();
		met.database22();
		met.database23();
		met.database24();
		met.database25();
		met.database26();
		met.database27();
		met.database28();
		met.database29();
		met.database30();
		met.database31();
		met.database32();
		met.database33();
		met.database34();
		met.database35();
		met.database36();
		met.letsHandle1();
		met.letsHandle1();
		met.letsHandle1();
		met.letsHandle5();
		met.letsHandle6();
		met.letsHandle7();
		met.letsHandle8();
		met.letsHandle9();
		met.letsHandle10();
		met.letsHandle11();
		met.letsHandle12();
		met.letsHandle13();
		met.letsHandle14();
		met.letsHandle15();
		met.letsHandle16();
		met.letsHandle17();
		met.letsHandle18();
		met.letsHandle19();
		met.letsHandle20();
		met.letsHandle21();
		met.letsHandle22();
		met.letsHandle23();
		met.letsHandle24();
		met.letsHandle25();
		met.letsHandle26();
		met.letsHandle27();
		met.letsHandle28();
		met.letsHandle29();
		met.letsHandle30();

	}

}
