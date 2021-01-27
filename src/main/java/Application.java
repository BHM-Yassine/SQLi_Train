import com.yassine.basic.Train;
import com.yassine.decorator.Passenger;
import com.yassine.decorator.Restaurant;

public class Application {

	public static void main(String[] args) {

//		ITrain t = new Train();
//		
//		ITrain tt = new Restaurant(t);
//		
//		ITrain ttt = new Passenger(tt);
//		
//		ITrain tttt = new Head(ttt);
//		
//		
//		if(tttt instanceof Head)

		// ITrain train2 = new Cargo(new Passenger(new Restaurant(new Train())));

		// System.out.println(train2.print());

		Train train = new Train("HCCC");
		
		System.out.println(train.print());
		
		train.fill();
		// System.out.println(train.print());
		

	}

}
