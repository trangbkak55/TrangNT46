package viettel;
/*Class được sử dụng để xây dưng các FageObject
*Class được sử dụng để nhóm các test theo function/feature
*ScreenPlay: Class được sử dụng để xây dưng lên các Abilities
*/
public class BaiTap {
	//properties
	public String value;
	public String CSS;
	//Contructor
	public BaiTap()
	{
		
	}
	public BaiTap(String value, String CSS)
	{
		this.value = value;
		this.CSS = CSS;
	}
	//method
	public void Input(String value)
	{
		this.value = value;
	}
	
	public void AppClass(String CSS)
	{
		this.CSS = CSS;
	}
	
	public void DoAction()
	{
		System.out.println(this.value);
		System.out.println(this.CSS);
	}
}
