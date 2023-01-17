package com.ty.springbootwithgooglesheet.dto;

import java.util.List;

public class GoogleSheetDto {
	private String sheetName;
	private List<List<String>> dataToBeUpdated;
	
	
	public String getSheetName() {
		return sheetName;
	}
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	public List<List<String>> getDataToBeUpdated() {
		return dataToBeUpdated;
	}
	public void setDataToBeUpdated(List<List<String>> dataToBeUpdated) {
		this.dataToBeUpdated = dataToBeUpdated;
	}
	
}
