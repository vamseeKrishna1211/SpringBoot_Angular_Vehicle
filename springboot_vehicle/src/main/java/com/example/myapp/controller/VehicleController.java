package com.example.myapp.controller;

import com.example.myapp.services.VehicleService;
import com.example.myapp.vo.VehicleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	/*   
	 * this method is for save all records. it won't save even one having error.
	 * */
	@PostMapping("/vehicles/saveall")
	public List<VehicleVO> saveAllVehiclesInfo(
			@Valid @NotNull @RequestBody List<VehicleVO> vehicles) {

		List<VehicleVO> savedVehicles = vehicleService
				.saveAllVehicles(vehicles);
		return savedVehicles;
	}
/*   
 * this method is for save all records without the one having error.
 * */
	@PostMapping("/vehicles/partial")
	public List<VehicleVO> savePartialVehiclesInfo(
			@Valid @NotNull @RequestBody List<VehicleVO> vehicles) {

		List<VehicleVO> savedVehicles = vehicleService
				.savePartialVehicles(vehicles);
		return savedVehicles;
	}
	/*   
	 * this method is for get all records in database.
	 * */
	@GetMapping("/vehicles/listall")
	public List<VehicleVO> getAllVehicles() {
		List<VehicleVO> vehicles = vehicleService.getAllVehicles();
		return vehicles;
	}
}
