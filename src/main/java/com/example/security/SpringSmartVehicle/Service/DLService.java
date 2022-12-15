package com.example.security.SpringSmartVehicle.Service;

import java.util.List;

import com.example.security.SpringSmartVehicle.entity.DrivingLicense;

public interface DLService {

	String createDL(DrivingLicense dl);

	List<DrivingLicense> getAll();

	String update(DrivingLicense dl);

	DrivingLicense getAlldls();

	DrivingLicense getById(int id);

	int getIdByMobNo(long mobNo);

	int generateOTP();

	//boolean supports(Class clazz);

//	void validate(Object target, Errors errors);

	//void createDL(Model model);

}