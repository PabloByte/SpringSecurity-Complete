package com.beforesecurity.beforesecurity;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.beforesecurity.beforesecurity.dto.ProjectDto;
import com.beforesecurity.beforesecurity.dto.ProjectDtoInsert;





@Component
public class ProjectValidation implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {

    return ProjectDtoInsert.class.isAssignableFrom(clazz);
  }


  @Override
  public void validate(Object target, Errors errors) {
   
    ProjectDtoInsert project = (ProjectDtoInsert) target;

    ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name", null, "The Project Name must not be empty or in blank");

    if(project.getName() == null || project.getName().isBlank()) {
      errors.rejectValue("name", null,"El proyecto no puede contener un nombre vacio");

    }

    if(project.getDescription() == null || project.getDescription().isBlank()){

      errors.rejectValue("name", null,"El proyecto no puede contener Una descripcion del mismo vacia");


    }

    if(project.getStatus() == null || project.getStatus().isBlank()){

      errors.rejectValue("name", null,"Se debe definir el estado del proyecto para guardarlo");


    }


  }


}
