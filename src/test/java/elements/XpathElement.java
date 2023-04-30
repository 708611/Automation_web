package elements;

public class XpathElement {
	
	
	public static String location="New York, NY";
	public static String distanceValue="Price - High to Low";
	//Price - Low to High
	public static String fistNameValue="Amar";
	public static String lastNameValue="Kumar";
	public static String emailValue="BrinkerTest@gmail.com";
	public static String Country="India";
	public static String cityName="Kolkata";
	public static String mobileno="7686891288";
	public static String memberId="221824045D";
	public static String username="AmarTest";
	public static String password="Brinker1";
	
	public static String qs1="In what city were you born?";
	public static String qs2="";
	public static String qs3="";
	
	
	
	
	
	
	
	
	
	
	public static String login="//*[contains(text(),'SIGN IN')]";
	public static String locationXpath="//*[contains(@name,'destination')]";
	public static String checkinXpath="//div[contains(@class,'btn-group booking-bar__booking-dates booking-dates')]//button";
	public static String selectDate="//table[contains(@class,'ui-datepicker-calendar')]//tbody//tr[]//td[contains(@class,' active-date active-date-check-out')]//a[contains(text(),'21')]";
	public static String searchButton="//button[contains(@class,'search-btn btn-primary')]";
	public static String distance="//select[contains(@id,'sort-by')]";
	public static String select1sthotel="//*[contains(@class,'col-sm-7 col-md-6 hotel-rate is-active')]//div[contains(@class,'money')]";
	
	public static String joinButton="//div[contains(@class,'wyndham-rewards-links')]//a[contains(text(),'JOIN')]";
	public static String fname="//input[contains(@id,'firstName')]";
	public static String lnmae="//input[contains(@id,'lastName')]";
	public static String emailAddress="//input[contains(@id,'emailAddress')]";
	public static String zipCode="//input[contains(@id,'zipCode0')]";
	public static String selectCountry="//select[contains(@id,'country0')]";
	public static String phoneNumber="//input[contains(@id,'phoneNumber0')]";
	public static String city="//input[contains(@id,'city0')]";
	public static String JoinNow="//button[contains(@class,'submit btn btn-primary btn-block')]";
	
	public static String usernamefield="//input[contains(@id,'wrUsername')]";
	public static String passwordfield="//input[contains(@id,'wrPassword')]";
	public static String loginpagebutton="//button[contains(@id,'signIn')]";
	
	public static String language="//button[contains(@id,'languageDropdown')]";
	
	
	public static String LocationDesti="(//a[contains(text(),'Locations')])[1]";
	public static String region="//select[contains(@id,'dest-region')]";
	public static String region1="//select[contains(@id,'dest-region')]//option";
	public static String destination="(//button[contains(@class,'btn-secondary')])[4]";
	
	
	
	
	

}
