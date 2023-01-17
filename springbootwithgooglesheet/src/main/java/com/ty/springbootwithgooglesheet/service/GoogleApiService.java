package com.ty.springbootwithgooglesheet.service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springbootwithgooglesheet.dto.GoogleSheetDto;
import com.ty.springbootwithgooglesheet.util.GoogleApiUtil;

@Service
public class GoogleApiService {

	@Autowired
	GoogleApiUtil googleApiUtil;
	public Map<Object,Object> readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
		
		return googleApiUtil.getDataFromSheet();
	}
	public String createSheet(GoogleSheetDto request) throws GeneralSecurityException, IOException {
		
		return googleApiUtil.createGoogleSheet(request);
	}

}
