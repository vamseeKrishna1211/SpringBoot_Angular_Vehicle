package com.example.myapp.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MapperUtils extends ModelMapper {

	public MapperUtils() {
		this.getConfiguration().setFieldMatchingEnabled(true);
	}
}
