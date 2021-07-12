package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserForm {

	private Long id;

	@NotNull
	@NotBlank
	@Size(min = 1, max = 20)
	private String name;

	@NotNull
	private boolean gender = true;

	@NotNull
	@NotBlank
	private String birth;

}
