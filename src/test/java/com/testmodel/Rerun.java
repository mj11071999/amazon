package com.testmodel;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
     int start= 0;
     int end = 4;
	@Override
	public boolean retry(ITestResult result) {
		     //1<4
		if (start<end) {
			start++;
			return true;	
		}
		return false;
	}

}

//true
