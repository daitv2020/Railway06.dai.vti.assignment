package com.vti.entity;

import java.time.LocalDate;

public class exam {
	int examId;
	String code;
	String title;
	categoryQuestion categoryQuestion;
	int duration;
	account account;
	LocalDate createDate;
	question[] questionInExam;
}