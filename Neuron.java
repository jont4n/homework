
public class Neuron {
	
	private double inSignal;
	private double outSignal;
	private double wtSignal;
		
	public double getOutSignal() { return outSignal;}
	public double getWtSignal() { return wtSignal;}
	public double getInSignal() { return inSignal;}
	
	public void setInSignal(double count) {
		inSignal = count;
	}
	
	public void setWtSignal(double count) {
		wtSignal = count;
	}
	
	public void setOutSignal() {
		 outSignal = inSignal*wtSignal;
	}
	
	public void print() {
		System.out.format("Сигнал %.1f  Вес %.1f%n",inSignal,wtSignal);
	}
	
	public double res() {
		if(outSignal>=0.5)
			return outSignal;
		else
			return 0;
	}
}
