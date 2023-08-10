package com.xworkz.controller;

import java.sql.SQLException;

import com.xworkz.dto.SoftwareDto;
import com.xworkz.service.SoftwareService;
import com.xworkz.service.SoftwareServiceImpl;

public class SoftwareRunner {

	public static void main(String[] args) throws SQLException {
		SoftwareDto dto = new SoftwareDto();
		
		 dto.setId(7);
		 dto.setUserName("Ganavi");
		 dto.setEmail("nvganavi@gmail.com");
		 dto.setPhoneNumber(9066404341l);
		 dto.setSoftwareName("Lombok");
		 dto.setVersion(8.2);
		 dto.setDOE(01-2023);
		 dto.setPassword("gans01");
		 dto.setPrice(500.0);
		 dto.setOsVersion(8.5);
SoftwareService service=new SoftwareServiceImpl();
//service.validteAndSave(dto);
//service.onSearchByProductVersion(8.2);
//service.onSearchById(6);
//service.onSearchBySoftwareName("AntiVirus");
//service.readAll();
//service.onDelete("Lombok");
//service.onUpdateByOsVersion(8.5, 600.0);
//service.onUpdate(8.5, 10.0);
service.onUpdate(1, "seetha", "seetha@gmail.com",9740322295l, "JRE", 3.11, 01-2024, "setha", 1000, 5.1);
	}

}
