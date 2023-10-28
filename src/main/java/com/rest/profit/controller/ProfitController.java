package com.rest.profit.controller;
import com.rest.profit.model.ProfitModel;
import com.rest.profit.response.*;
import com.rest.profit.service.ProfitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profit")
@CrossOrigin
public class ProfitController {
	
	@Autowired
	private ProfitService profitService;
	
	@GetMapping("/get")
	public ApiResponse getProfit(@RequestParam String Id) {
		return profitService.getProfit(Id);
	}
	
	@PostMapping("/post")
	@CrossOrigin(origins="http://localhost:5173")
	public ApiResponse createProfit(@RequestBody ProfitModel profitModel) {
		return profitService.createProfit(profitModel);
	}

}
