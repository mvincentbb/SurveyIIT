package com.ipnetinstitute.csc394.backend.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor@NoArgsConstructor
@Data
public class Question  extends BaseEntity{
	
	
	String title;
	@OneToMany(mappedBy = "question", cascade = {CascadeType.ALL})
	private List<CategorySurveyQuestion> categorySurveyQuestions = new ArrayList<CategorySurveyQuestion>();
	
	@OneToMany(mappedBy = "question", cascade = {CascadeType.ALL})
	private List<StudentSurvey> studentSurveys = new ArrayList<StudentSurvey>();
	

}
