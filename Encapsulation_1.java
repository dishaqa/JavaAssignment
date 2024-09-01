package Encaplulation;
class Amazon
{
	private String username = "test@gmail.com";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}


public class Encapsulation_1
{

	public static void main(String[] args)
	{

		Amazon a1 = new Amazon();
		a1.setUsername("disha@gamil.com");
		System.out.println(a1.getUsername());

	}

}
