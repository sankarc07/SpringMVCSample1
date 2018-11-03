package com.spring.validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.domain.DineInForm;

@Component
public class DineInFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return DineInForm.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		DineInForm dineInForm = (DineInForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "restaurantName", "NotEmpty.restaurantName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "restaurantType", "NotEmpty.restaurantType");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "reserveOn", "NotEmpty.reserveOn");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "reserveTime", "NotEmpty.reserveTime");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "guestName", "NotEmpty.guestName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "noOfGuest", "NotEmpty.noOfGuest");

		if (!StringUtils.isEmpty(dineInForm.getNoOfGuest()) && Integer.valueOf(dineInForm.getNoOfGuest()) > 30) {
			errors.rejectValue("noOfGuest", "NotEmpty.noOfGuest.total", "No of guest should be less than 30");
		}
		Date date = dineInForm.getReserveOn();
		if (date != null) {
			Date currentDate = new Date();
			if (!(date.compareTo(currentDate) > 0)) {
				errors.rejectValue("reserveOn", "NotEmpty.reserveOn.currentDate", "Date mush be gt current date");
			}
		}
	}

}
