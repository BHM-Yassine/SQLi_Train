package com.yassine.decorator;

import com.yassine.basic.ITrain;

public class TrainDecorator implements ITrain {
	
	protected ITrain train;
	protected String design;
	
	public TrainDecorator(ITrain train) {
		super();
		this.train = train;
	}

	public String print() {
		return this.train.print();
	}

}
