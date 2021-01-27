package com.yassine.decorator;

import com.yassine.basic.ITrain;
import com.yassine.factory.Constant;

public class Cargo extends TrainDecorator {

	public Cargo(ITrain train) {
		super(train);
		this.design = Constant.E_Cargo;
	}
	
    public boolean isEmpty() {
        return this.design.equals(Constant.E_Cargo);
    }
	
    public void fill(){
        this.design = Constant.L_Cargo;
    }
    
	@Override
	public String print() {
		return super.print() + Constant.Connector + this.design;
	}
	
}
