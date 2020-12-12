
public class Program {
	
	public static void main(String args[]) {
		
		Neuron vodka = new Neuron();
		Neuron sun = new Neuron();
		Neuron friend = new Neuron();
		
		double inS1[]= {1};
		double outS1[]= {1};
		double inS2[]= {0};
		double outS2[]= {1};
		double inS3[]= {0};
		double outS3[]= {1};
		Neuron outNeuron = new Neuron();		
		//
		vodka.setInSignal(inS1);
		vodka.setWtSignal(outS1);
		vodka.setOutSignal();

		sun.setInSignal(inS2);
		sun.setWtSignal(outS2);
		sun.setOutSignal();
		
		friend.setInSignal(inS3);
		friend.setWtSignal(outS3);
		friend.setOutSignal();
		//
		double sum[] = {vodka.res(), sun.res(), friend.res()};
		double hak[] = {0.5,0.5,0.5};
		//System.out.println(sum);
		outNeuron.setInSignal(sum);
		outNeuron.setWtSignal(hak);
		outNeuron.setOutSignal();
		System.out.println(outNeuron.res());
		if(outNeuron.res() >= 1)
			System.out.println("Пездуй");
		else
			System.out.println("Не пездуй");
	}
}
