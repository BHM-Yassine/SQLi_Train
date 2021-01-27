package com.yassine.factory;

import com.yassine.basic.Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.yassine.basic.ITrain;
import com.yassine.decorator.Cargo;
import com.yassine.decorator.Head;
import com.yassine.decorator.Passenger;
import com.yassine.decorator.Restaurant;
import com.yassine.decorator.TrainDecorator;

public class TrainFactory implements ITrainFactory {

	public ITrain createDecorator(char wagonChar, ITrain train) {
		ITrain newTrain = null;

		switch (wagonChar) {

		case 'H':
			newTrain = new Head(train);
			break;

		case 'P':
			newTrain = new Passenger(train);
			break;

		case 'R':
			newTrain = new Restaurant(train);
			break;

		case 'C':
			newTrain = new Cargo(train);
			break;

		default:
			new IllegalArgumentException("type of wagon not defined");

		}
		return newTrain;
	}

	public ITrain createTrain(String wagonsChar) {
		ITrain myTrain = new Train();

		for (int i = 0; i < wagonsChar.length(); i++) {
			ITrain tmpTrain = createDecorator(wagonsChar.charAt(i), myTrain);

			if (tmpTrain instanceof Head && i != 0)
				((Head) tmpTrain).setHeadLast();

			myTrain = tmpTrain;
		}
		
		return myTrain;
	}

	public String detacheEnd(String design) {
		List<String> list = new ArrayList<String>();

		String[] mots = design.split("::");

		for (String mot : mots) {
			list.add(mot);
		}

		list.remove(list.size() - 1);

		return String.join("::", list);
	}

	public String detacheHead(String design) {
		List<String> list = new ArrayList<String>();

		String[] mots = design.split("::");

		for (String mot : mots) {
			if(mot.equals(Constant.F_Head) || mot.equals(Constant.L_Head))
				continue;
			else 
				list.add(mot);
		}
		return String.join("::", list);
	}

	public String fill(String design) {
		String[] mots = design.split("::");

		for (int i = 0; i < mots.length; i++) {
			if (mots[i].equals(Constant.E_Cargo)) {
				mots[i] = Constant.L_Cargo;
				break;
			}
		}
		
		return String.join("::", mots);
	}

}
