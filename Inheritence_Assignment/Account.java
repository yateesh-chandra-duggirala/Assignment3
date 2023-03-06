import java.lang.*;
import java.io.*;
import java.util.*;

class Account
{
	private int accountNo;
	private String name, address, dob;
	private long phoneNo;
	private float balance;
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void getAddress(String address)
	{
		this.address = address;
	}
	
	public String setAddress()
	{
		return address;
	}
	
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	
	public String getDob()
	{
		return dob;
	}
	
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	
	public long getPhoneNo()
	{
		return phoneNo;
	}
	
	public void setBalance(float balance)
	{
		this.balance = balance;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	
	public Account(int accountNo, String name, String address, String dob, long phoneNo, float balance)
	{
		this.accountNo = accountNo;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.balance = balance;
		
	}
	
	public Account()
	{}
	
	public void closeAccount()
	{
		System.out.println("Close account Method of Account Class");
	}
}

