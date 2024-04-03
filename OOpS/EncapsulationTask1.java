package OOpS;

import java.util.Scanner;

public class EncapsulationTask1 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter your Tamil marks");
		int t=ss.nextInt();
		System.out.println("Enter your English marks");
		int e=ss.nextInt();
		System.out.println("Enter your Maths marks");
		int m=ss.nextInt();
		System.out.println("Enter your Science marks");
		int sc=ss.nextInt();
		System.out.println("Enter your Social marks");
		int s=ss.nextInt();
		Mark ob=new Mark();
		ob.setmarks(t,e,m,sc,s);
		ob.show();
		
	}
	
}
class Mark{
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social;
void setmarks(int t,int e,int m,int sc,int s) {
	tamil =t;
    english=e;
    maths=m;
    science=sc;
    social=s;
}
void show() {
    if(tamil>=40&&tamil<=100) {
    	if(tamil>=90&&tamil<=100)
    		System.out.println("Grade Tamil O");
    	else if(tamil>=80&&tamil<90)
    		System.out.println("Grade Tamil A");
    	else if(tamil>=60&&tamil<80)
    		System.out.println("Grade Tamil B");
    	else 
    		System.out.println("Grade Tamil C");
    }
    else
    	System.out.println("Fail in Tamil");
    
    
    if(english>=40&&english<=100) {
    	if(english>=90&&english<=100)
    		System.out.println("Grade English O");
    	else if(english>=80&&english<90)
    		System.out.println("Grade English A");
    	else if(english>=60&&english<80)
    		System.out.println("Grade English B");
    	else if(english<60)
    		System.out.println("Grade English C");
    	  else
    	    	System.out.println("Fail in English");
    }
    else
    	System.out.println("Ivalid Mark");
    
    
    if(maths>=40&&maths<=100) {
    	if(maths>=90&&maths<=100)
    		System.out.println("Grade Maths O");
    	else if(maths>=80&&maths<90)
    		System.out.println("Grade Maths A");
    	else if(maths>=60&&maths<80)
    		System.out.println("Grade Maths B");
    	else if(maths<60)
    		System.out.println("Grade Maths C");
    	  else
    	    	System.out.println("Fail in Maths");
    }
    else
    	System.out.println("Ivalid Mark");
    
    
    if(science>=40&&science<=100) {
    	if(science>=90&&science<=100)
    		System.out.println("Grade Science O");
    	else if(science>=80&&science<90)
    		System.out.println("Grade Science A");
    	else if(science>=60&&science<80)
    		System.out.println("Grade Science B");
    	else if(science<60)
    		System.out.println("Grade Science C");
    	else 
    		System.out.println("Fail in Science");
    }
    else
    	System.out.println("Ivalid Mark");
    
    if(social>=40&&social<=100) {
    	if(social>=90&&social<=100)
    		System.out.println("Grade Social O");
    	else if(social>=80&&social<90)
    		System.out.println("Grade Social A");
    	else if(social>=60&&social<80)
    		System.out.println("Grade Social B");
    	else if(social<60)
    		System.out.println("Grade Social C");
    	else
    		System.out.println("Fail in Social");
    }
    else
    	System.out.println("Ivalid Mark");
    

=tamil+english+maths+science+social;
    System.out.println("Total Mark : " +total);
    
}
}