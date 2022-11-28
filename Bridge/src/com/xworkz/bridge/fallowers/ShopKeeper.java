package com.xworkz.bridge.fallowers;

import com.xworkz.bridge.rules.Shop;

public class ShopKeeper implements Shop {

	@Override
	public String name(String name) {
		System.out.println(name);
		return null;
	}

	@Override
	public double cost(double cost) {
		System.out.println(cost);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long number(long no) {
		System.out.println(no);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String gstNo(String gstNo) {
		System.out.println(gstNo);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int workers(int workers) {
		System.out.println(workers);
		// TODO Auto-generated method stub
		return 0;
	}

}
