package com.rest.profit.serviceImpl;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.profit.model.ProfitModel;
import com.rest.profit.repository.ProfitRepository;
import com.rest.profit.response.ApiResponse;
import com.rest.profit.service.ProfitService;

@Component
public class ProfitServiceImplementation implements ProfitService {

	@Autowired
	private ProfitRepository profitRepository;

	@Override
	public ApiResponse getProfit(String id) {
		try {
			Optional<ProfitModel> data = profitRepository.findById(id);
			if (data.isEmpty()) {
				return new ApiResponse(false, " No data found", null);
			} else {
				return new ApiResponse(true, "fetched data successfully", data);
			}
		} catch (Exception e) {
			return new ApiResponse(false, e.getMessage(), Collections.emptyList());
		}
	}

	@Override
	public ApiResponse getAllProfit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse createProfit(ProfitModel profitModel) {
		try {
			//if (!profitRepository.exitByName(profitModel.getHeadDescription())) {
				ProfitModel profit_save = profitRepository.save(profitModel);
				return new ApiResponse(true, "profit file created successfully", profit_save);
			//}
			//return new ApiResponse(false, "profit Description already exist");

		} catch (Exception e) {
			return new ApiResponse(false, "profit Description already exist");

		}
	}

}
