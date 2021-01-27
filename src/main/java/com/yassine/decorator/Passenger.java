package com.yassine.decorator;

import com.yassine.basic.ITrain;
import com.yassine.factory.Constant;

public class Passenger extends TrainDecorator {

	public Passenger(ITrain train) {
		super(train);
		this.design = Constant.Passenger;
	}
	
	@Override
	public String print() {
		return super.print() + Constant.Connector + this.design;
	}

}
