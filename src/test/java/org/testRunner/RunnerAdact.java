package org.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.JvmReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prasanth\\eclipse-workspace\\TestCucumber\\src\\test\\resources\\CucumberTestCases\\AdactinLogin.feature",
glue="org.ada",
plugin= {"pretty","json:src\\test\\resources\\output\\prasanth1.json"},

monochrome=true

)


public class RunnerAdact { 
	@AfterClass
	public static void afterComplition() {
		
		JvmReporting.getJvmReport("C:\\Users\\prasanth\\eclipse-workspace\\TestCucumber\\"
				+ "src\\test\\resources\\output\\prasanth1.json");

		
	}


	}


