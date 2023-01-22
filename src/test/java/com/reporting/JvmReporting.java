package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReporting {
	public static void getJvmReport(String jsonFile) {
		
		File file=new File("C:\\Users\\prasanth\\eclipse-workspace\\TestCucumber\\src\\test\\resources\\output");
		
		
		Configuration configuration=new Configuration(file, "Adakin report");
		
		configuration.addClassifications("os", "windows 10");
		configuration.addClassifications("os", "windows 10");

		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		
		ReportBuilder reportBuilder=new ReportBuilder(jsonFiles, configuration);
		
		reportBuilder.generateReports();
	}

}
