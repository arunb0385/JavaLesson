package Exception;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ob=new A1();
		try {
			ob.validAge(10);
		} catch (AgeInvalidException e) {  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class AgeInvalidException extends Exception{
	AgeInvalidException(String str){
		super(str);
	}
	
}
class A1{
	void validAge(int age) throws AgeInvalidException{
		try {
		if(age<18) 
			throw new AgeInvalidException("Not Eligible to vote");	
		else 
			System.out.println(" Eligible to vote");
		}
		
		catch(AgeInvalidException e) {
			System.out.println(e);
		}
		
		
	}
}
