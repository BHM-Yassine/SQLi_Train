package com.yassine.decorator;

import com.yassine.basic.ITrain;
import com.yassine.factory.Constant;

public class Restaurant extends TrainDecorator {

	public Restaurant(ITrain train) {
		super(train);
		this.design = Constant.Restaurant;
	}
	
	@Override
	public String print() {
		return super.print() + Constant.Connector + this.design;
	}
	
}
