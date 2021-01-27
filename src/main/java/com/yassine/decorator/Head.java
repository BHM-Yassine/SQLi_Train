package com.yassine.decorator;

import com.yassine.basic.ITrain;
import com.yassine.factory.Constant;

public class Head extends TrainDecorator {

	public Head(ITrain train) {
		super(train);
		this.design = Constant.F_Head;
	}
	
	public void setHeadLast() {
		this.design = Constant.L_Head;
	}
	
	@Override
	public String print() {
		if(this.design.equals(Constant.F_Head))
			return this.design;
		return super.print() + Constant.Connector + this.design;
	}

}
