package com.mytag;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Service
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> candidate) {
		return MyUser.class.isAssignableFrom(candidate);	
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		System.out.println(((MyUser)arg0).getFirstName());
		ValidationUtils
		.rejectIfEmptyOrWhitespace(errors, "firstName", "required", "Field is required.");
       
		ValidationUtils
        .rejectIfEmptyOrWhitespace(errors, "lastName", "required", "Field is required.");
		
		   errors.rejectValue("lastName","lastName", " 내용이 없잖아 !!!");
       }

}
