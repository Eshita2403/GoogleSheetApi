package com.ty.springbootwithgooglesheet.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springbootwithgooglesheet.dto.GoogleSheetDto;
import com.ty.springbootwithgooglesheet.service.GoogleApiService;

@RestController
public class DashboardController {
	@Autowired
	private GoogleApiService googleApiService;
	@GetMapping("/check")
	public String check() {
		return "checking API";
	}
	@GetMapping("/getData")
	public Map<Object, Object> readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
		return googleApiService.readDataFromGoogleSheet();
	}
	
	@PostMapping("/createSheet")
	public String createGooglesheet(@RequestBody GoogleSheetDto request) throws GeneralSecurityException, IOException {
		return googleApiService.createSheet(request);
		
	}
}
