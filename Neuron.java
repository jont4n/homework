
public class Neuron {
	
	private double inSignal[];
	private double outSignal;
	private double wtSignal[];
		
	public double getOutSignal() { return outSignal;}
	//public double geAtWtSignal() { return wtSignal;}
	//public double getInSignal() { return inSignal;}
	
	public void setInSignal(double count[]) {
		inSignal = count;
	}
	
	public void setWtSignal(double count[]) {
		wtSignal = count;
	}
	
	public void setOutSignal() {
		
		double sum = 0;
		for(int i=0; i<wtSignal.length; i++)
		{
			sum+=inSignal[i]*wtSignal[i];
		}
		outSignal=sum;
		System.out.println(sum);
	}
	
	public void print() {
		System.out.format("Сигнал %.1f  Вес %.1f%n",inSignal,wtSignal);
	}
	
	public double res() {
		if(outSignal>=1)
			return outSignal=1;
		else
			return outSignal=0;
	}
}
