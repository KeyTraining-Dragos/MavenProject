package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.internal.IResultListener;

public class TestNgListener implements IResultListener{

	@Override
	public void onTestStart(ITestResult result) {
		Log.info("+++++++++++++++++++++++++++++++++");
		//clasa + metoda
		Log.info("Started test :" + result.getTestClass().getRealClass().getSimpleName()+" - "+result.getMethod().getMethodName());
		//pentru numele clasei care ruleaza
		Log.info(result.getTestClass().getRealClass().getSimpleName());
		Log.info("+++++++++++++++++++++++++++++++++");
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("Start time :" + timestamp);
		Log.info("+++++++++++++++++++++++++++++++++");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info("+++++++++++++++++++++++++++++++++");
		Log.info("Passed test :" + result.getMethod().getMethodName());
		Log.info("+++++++++++++++++++++++++++++++++");
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("End time :" + timestamp);
		Log.info("+++++++++++++++++++++++++++++++++");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log.error("+++++++++++++++++++++++++++++++++");
		Log.error("Failed test :" + result.getMethod().getMethodName());
		Log.error("+++++++++++++++++++++++++++++++++");
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.error("Failed time :" + timestamp);
		Log.error(result.getThrowable());
		Log.error("+++++++++++++++++++++++++++++++++");
	}

	
	
	
	
}
