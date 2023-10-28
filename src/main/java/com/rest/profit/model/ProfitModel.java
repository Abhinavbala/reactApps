package com.rest.profit.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("profit")
public class ProfitModel {
	@Id
	private String id;
	private String headDescription;
	private String functionName;
	private String currentMonth;
	private String previousMonth;
	private String variance;

}
