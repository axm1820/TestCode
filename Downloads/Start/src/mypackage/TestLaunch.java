package mypackage;

public class TestLaunch  {
	
	  public static void main(String args[]) throws InterruptedException {
		
		  String url="https://login.qa.jelli.com/index.html?service=accounts&target=https%3A%2F%2Faccounts.qa.jelli.com%2F#/authentication/loggedOut";
		  JelliBase x= new JelliBase(url);
		  x.setup();
		  x.fill_inputform();
		  x.submit();
		  x.validate_login();
		  Logout lg= new Logout(x);
		  lg.logout();
		  
	  }
	

}
