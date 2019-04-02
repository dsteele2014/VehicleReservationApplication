package application;

import java.util.ArrayList;

public class Account 
{
		String type;
		String userName;
		String password;
		public static ArrayList<Account> accounts = new ArrayList<>(); 
		
		public Account(String type, String userName, String password)
		{
			this.type=type;
			this.userName= userName;
			this.password=password;
			
		}
		
		public void addAccount()
		{
			accounts.add(this);
		}

		public ArrayList<Account> getAccounts() 
		{
			return accounts;
		}

		public void setAccounts(ArrayList<Account> accounts) {
			this.accounts = accounts;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		


}
