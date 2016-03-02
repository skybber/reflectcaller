package reflectcall;

public class TestReflectCall
{
	public String hallo()
	{
		// Just change phallo1 -> phallo2
		return phallo1();
		//return phallo2();
	}

	private String phallo1()
	{
		return "phallo";
	}

	private String phallo2()
	{
		return "phallo";
	}
}
