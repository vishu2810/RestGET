package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class getAPItest extends TestBase{
	
	TestBase testbase;
	String serviceurl;
	String APIurl;
	String url;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp(){
		testbase = new TestBase();
		 APIurl = prop.getProperty("APIurl");
		 serviceurl = prop.getProperty("ServiceUrl");
		 url = APIurl+serviceurl;
					
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException{
		 restClient = new RestClient();
		 restClient.get(url);	
		
	}

}
