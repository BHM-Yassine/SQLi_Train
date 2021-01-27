package com.yassine.factory;

import com.yassine.basic.ITrain;
import com.yassine.decorator.TrainDecorator;

public interface ITrainFactory {
	
	ITrain createTrain(String wagonsChar);

	String detacheEnd(String print);

	String detacheHead(String print);

	String fill(String print);

}
