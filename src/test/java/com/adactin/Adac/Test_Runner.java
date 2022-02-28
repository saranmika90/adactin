package com.adactin.Adac;

import com.pom.Book_Hotel;
import com.pom.Log_Out;
import com.pom.Login_In;
import com.pom.Search_Hotel;
import com.pom.SelectHotel;

public class Test_Runner extends Base_Class {
	public static void main(String[] args) throws InterruptedException  {	
		 browserlaunch("chrome");
		 getUrlmethod("https://adactinhotelapp.com/");
		 Login_In s=new Login_In(driver);
		Search_Hotel s1=new Search_Hotel(driver);
		SelectHotel s2=new SelectHotel(driver);
		Book_Hotel s3=new Book_Hotel(driver);
		Log_Out s4=new Log_Out(driver);
		methodforinput(s.getLogin(), "sanamika");
		methodforinput(s.getPassword(),"Sanam@29");
		methodforclick(s.getLog());
		Thread.sleep(3000);
		dropdown(s1.getLocation(),"value","London");
		dropdown(s1.getHotel(),"value","Hotel Sunshine");
		 dropdown(s1.getType(),"value","Super Deluxe");
		 dropdown(s1.getNumber(),"value","1");
		 s1.getDate().clear();
		 methodforinput(s1.getDate(),"29/4/2022");
		 s1.getPickup().clear();
		 methodforinput(s1.getPickup(),"30/4/2022");
		 dropdown(s1.getAdult(),"value","1");
		 dropdown(s1.getChild(),"value","2");
		 methodforclick(s1.getSubmit());
		 methodforclick(s2.getRadio());
		 methodforclick(s2.getContin());
		 methodforinput(s3.getName(),"saran");
		 methodforinput(s3.getLast(),"ash");
		 methodforinput(s3.getAddress(),"no 5,ramakrishna,3rd street");
		 methodforinput(s3.getCcnum(),"9697859485859604");
		 dropdown(s3.getCctype(),"index","3");
		 dropdown(s3.getExpmonth(),"index","7");
		 dropdown(s3.getExpyear(),"index","9");
		 methodforinput(s3.getCvv(),"234");
		 Thread.sleep(6000);
		 methodforclick(s3.getBook());
		 Thread.sleep(3000);
		 methodforclick(s4.getLogout());
		 closemethod();
}
}
