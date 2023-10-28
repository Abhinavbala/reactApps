package com.rest.profit.service;

import com.rest.profit.model.ProfitModel;
import com.rest.profit.response.ApiResponse;

public interface ProfitService {
	ApiResponse getProfit(String id);
	ApiResponse getAllProfit();
	ApiResponse createProfit(ProfitModel profitModel);

}
