package Overriding;

class Bank{  
int RateOfInterest()
{
	return 0;
}  
}  
//Creating child classes.  
class SBI extends Bank{  
int RateOfInterest()
{
	return 8;
	}  
}  
  
class ICICI extends Bank{  
int RateOfInterest()
{
	return 7;
	}  
}  
class AXIS extends Bank{  
int RateOfInterest()
{
	return 9;
	}  
}  
//Test class to create objects and call the methods  
class Test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.RateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.RateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.RateOfInterest());  
}  
}  
