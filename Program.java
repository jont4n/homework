import java.util.ArrayList;

public class Program {
	
	public static void main(String args[]) {
		
		Neuron vodka = new Neuron();
		Neuron sun = new Neuron();
		Neuron friend = new Neuron();
		
		Neuron outNeuron = new Neuron();		
		//
		vodka.setInSignal(1);
		vodka.setWtSignal(0.5);
		vodka.setOutSignal();
		
		sun.setInSignal(0);
		sun.setWtSignal(0.5);
		sun.setOutSignal();
		
		friend.setInSignal(1);
		friend.setWtSignal(0.5);
		friend.setOutSignal();
		//
		double sum = vodka.res() + sun.res() + friend.res();
		//System.out.println(sum);
		outNeuron.setInSignal(sum);
		outNeuron.setWtSignal(1);
		outNeuron.setOutSignal();
		//System.out.println(outNeuron.res());
		if(outNeuron.res() >= 1)
			System.out.println("Пездуй");
		else
			System.out.println("Не пездуй");
	}
}
