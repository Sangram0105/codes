import java.util.Scanner;


public class WeatherReport {

	public static void main(String[] args) {
		
		int n;
		float hightemp=0f,Lowtemp=0f,Amountrain=0f,Amountsnow=0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days");
		n= sc.nextInt();
		
		Weather [] w= new Weather[n];
	    for(int i=0;i<n;i++) {
	    	w[i]=new Weather();
	    	
	        	System.out.println("Enter day");
	        	float d=sc.nextFloat();
	        	w[i].setDay(d);
	        	System.out.println("Enter hightemp");
	        	float highT=sc.nextFloat();
	        	w[i].setHightemp(highT);
	        	System.out.println("Enter Low Temp");
	        	float LowT = sc.nextFloat();
             	w[i].setLowTemp(LowT);
	        	System.out.println("Enter amount rain");
	        	float AmountR=sc.nextFloat();
	        	w[i].setAmountRain(AmountR);
	        	System.out.println("Enter Amount snow");
	        	float AmountS=sc.nextFloat();
	        	w[i].setAmountSnow(AmountS);
	       
	        
	    }
	    for(int i=0;i<n;i++) {
	    	hightemp=hightemp+w[i].getHightemp();
	    	Lowtemp=Lowtemp+w[i].getLowTemp();
	    	Amountrain=Amountrain+w[i].getAmountRain();
	    	Amountsnow=Amountsnow+w[i].getAmountSnow();
	    }
	    hightemp=hightemp/n;
	    Lowtemp=Lowtemp/n;
	    Amountrain=Amountrain/n;
	    Amountsnow=Amountsnow/n;
		System.out.println("Average highTemp is:"+hightemp);
		System.out.println("Average LowTemp is:"+Lowtemp);
		System.out.println("Average Amount rain is:"+Amountrain);
		System.out.println("Average Amount snow is:"+Amountsnow);
		

	}

}

 class Weather {
	private float Day;
	private float hightemp;
	private float lowTemp;
	private float AmountRain;
	private float AmountSnow;
 
	 public Weather() {
		 this.Day = 0;
		 this.hightemp = 0;
		 this.lowTemp = 0;
		 this.AmountRain = 0;
		 this.AmountSnow = 0;
	 }
 
 public float getDay() {
	 return Day;
 }
 public void setDay(float day) {
	 Day = day;
 }
 public float getHightemp() {
	 return hightemp;
 }
 public void setHightemp(float hightemp) {
	 this.hightemp = hightemp;
 }
 public float getLowTemp() {
	 return lowTemp;
 }
 public void setLowTemp(float lowTemp) {
	 this.lowTemp = lowTemp;
 }
 public float getAmountRain() {
	 return AmountRain;
 }
 public void setAmountRain(float amountRain) {
	 AmountRain = amountRain;
 }
 public float getAmountSnow() {
	 return AmountSnow;
 }
 public void setAmountSnow(float amountSnow) {
	 AmountSnow = amountSnow;
 }
	
 }
