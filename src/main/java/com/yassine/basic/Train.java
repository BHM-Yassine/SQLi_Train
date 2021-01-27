package com.yassine.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yassine.decorator.TrainDecorator;
import com.yassine.factory.Constant;
import com.yassine.factory.ITrainFactory;
import com.yassine.factory.TrainFactory;

public class Train implements ITrain {
	ITrainFactory factory = new TrainFactory();

	private String design = "Basic Train";

	public Train() {
		super();
	}

	public Train(String wagonsChar) {
		this.design = factory.createTrain(wagonsChar).print();
	}

	public String print() {
		return this.design;
	}

	public void detachEnd() {

		this.design = factory.detacheEnd(print());
	}

	public void detachHead() {
		this.design = factory.detacheHead(print());
	}

	public boolean fill() {
		String newDesign = factory.fill(design);
		
		if(newDesign.equals(design))
			return false;
		else {
			this.design = newDesign;
			return true;
		}
		
	}

}
