
public class Calculations {
	
	
	/*
	 * -1 is weak
	 * 0 is average
	 * 1 is strong
	 */
	
	public int diet(int height, int weight){
		
	double	bmi = (weight) / Math.pow(height/100, 2);
		
		if(bmi < 18.5){
			//-1 is skinny.
			return -1;
		} else if(bmi >= 18.5 && bmi <= 24.9){
			//0 is average weight.
			return 0;
		} else
			//1 is overweight.
			return 1;
		
	}
	
	//To calculate our upperBody.
	public int upperBody(int benchWeight, int bodyWeight){
			
		double avgBenchWeight = bodyWeight *1.25;
		
		if(benchWeight < bodyWeight)
			return -1;
		else if(benchWeight >= bodyWeight && benchWeight < avgBenchWeight)
			return 0;
		else
			return 1;
			
		}
	
	//To calculate our lowerBody.
	public int lowerBody(int squatWeight, int bodyWeight){
		
		double avgSquatWeight = bodyWeight * 1.5;
		
		if(squatWeight < avgSquatWeight)
			return -1;
		else if(squatWeight >= avgSquatWeight && squatWeight < avgSquatWeight)
			return 0;
		else
			return 1;
		
	}
	

}
