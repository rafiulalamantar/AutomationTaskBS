package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.net.MalformedURLException;

public class Listener implements ITestListener {
//    @Override
//    public void onTestStart(ITestResult result) {
//        String test = result.getMethod().getXmlTest().getLocalParameters().get("test").toString();
//        if (test.contains("regression")){
//            try {
//                TestBase.initialization();
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
//        }else {
//            System.out.println("Not Found");
//        }
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        ITestListener.super.onTestSuccess(result);
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        ITestListener.super.onTestFailure(result);
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        ITestListener.super.onTestSkipped(result);
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//    }
//
//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//        ITestListener.super.onTestFailedWithTimeout(result);
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//        ITestListener.super.onStart(context);
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        ITestListener.super.onFinish(context);
//    }
}
