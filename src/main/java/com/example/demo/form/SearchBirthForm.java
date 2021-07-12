package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchBirthForm {
	@NotNull
	@NotBlank
	private String start;

	@NotNull
	@NotBlank
	private String end;

}