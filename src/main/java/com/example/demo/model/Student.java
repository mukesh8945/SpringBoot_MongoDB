package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document //Map with Collection-Dockuments
public class Student {

	@Id // Primary Key
	private String empId;

	@NonNull
	private Integer empSId;

	@NonNull
	private String empName;
	@NonNull
	private Double empSfee;
}
