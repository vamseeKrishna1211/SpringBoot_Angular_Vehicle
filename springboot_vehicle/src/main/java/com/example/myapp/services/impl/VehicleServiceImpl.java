package com.example.myapp.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.model.Vehicle;
import com.example.myapp.repository.VehicleRepository;
import com.example.myapp.services.VehicleService;
import com.example.myapp.vo.VehicleVO;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	MapperUtils mapper;
	/*   
	 * this method is for save all records. it won't save even one having error.
	 * */
	@Override
	public List<VehicleVO> saveAllVehicles(List<VehicleVO> vehicles) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		for (VehicleVO vehicleVO : vehicles) {
			Vehicle vehicle = mapper.map(vehicleVO, Vehicle.class);
			vehicleList.add(vehicle);
		}

		vehicleList = vehicleRepository.saveAll(vehicleList);

		List<VehicleVO> createdVehicles = new ArrayList<VehicleVO>();
		for (Vehicle vehicle : vehicleList) {
			VehicleVO vehicleVO = mapper.map(vehicle, VehicleVO.class);
			createdVehicles.add(vehicleVO);
		}
		return createdVehicles;
	}
	/*   
	 * this method is for save all records without the one having error.
	 * */
	@Override
	public List<VehicleVO> savePartialVehicles(List<VehicleVO> vehicles) {
		List<VehicleVO> createdVehicles = new ArrayList<VehicleVO>();

		for (VehicleVO vehicleVO : vehicles) {
			Vehicle vehicle = mapper.map(vehicleVO, Vehicle.class);
			try {
				vehicle = vehicleRepository.save(vehicle);
				createdVehicles.add(mapper.map(vehicle, VehicleVO.class));
			} catch (Exception e) {
				// Ignore The Exception
			}
		}

		return createdVehicles;
	}

	/*   
	 * this method is for get all records in database.
	 * */
	@Override
	public List<VehicleVO> getAllVehicles() {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList = vehicleRepository.findAll();
		List<VehicleVO> voList = new ArrayList<VehicleVO>();
		for (Vehicle vehicle : vehicleList) {
			VehicleVO vehicleVO = mapper.map(vehicle, VehicleVO.class);
			voList.add(vehicleVO);
		}

		return voList;
	}
}
