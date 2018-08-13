package com.example.myapp.services;

import java.util.List;

import com.example.myapp.vo.VehicleVO;

public interface VehicleService {
	public List<VehicleVO> saveAllVehicles(List<VehicleVO> vehicles);

	public List<VehicleVO> savePartialVehicles(List<VehicleVO> vehicles);

	public List<VehicleVO> getAllVehicles();

}
