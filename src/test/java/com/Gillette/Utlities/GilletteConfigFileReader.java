package com.Gillette.Utlities;

import com.Gillette.ResuableComponents.Base;

public class GilletteConfigFileReader extends Base {

	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}