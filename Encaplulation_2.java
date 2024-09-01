package Encaplulation;

class Amazon_auth
{
	private int otp = 0000;

	public int getOtp() 
	{
		return otp;
	}

	public void setOtp(int otp) 
	{
		this.otp = otp;
	}
	
}
public class Encaplulation_2 
{

	public static void main(String[] args) 
	{
		
		Amazon_auth a2 = new Amazon_auth();
		a2.setOtp(1234);
		System.out.println(a2.getOtp());

	}

}
