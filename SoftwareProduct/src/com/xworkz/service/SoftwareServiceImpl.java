package com.xworkz.service;

import java.sql.SQLException;

import org.omg.CORBA.RepositoryIdHelper;

import com.xworkz.dto.SoftwareDto;
import com.xworkz.repository.SoftwareRepo;
import com.xworkz.repository.SoftwareRepoImpl;

public class SoftwareServiceImpl implements SoftwareService{
SoftwareRepo repo=new SoftwareRepoImpl(); 
	

	@Override
	public boolean validteAndSave(SoftwareDto dto) throws SQLException {
		boolean save=false;
		if(dto!=null) {
			save=repo.validteAndSave(dto);
			return true;
		}else {
		return false;
	}
	}
	public boolean onSearchByProductVersion(Double version) throws SQLException {
		boolean	search=false;
		if(version!=0) {
			search=repo.onSearchByProductVersion(version);
			return true;
		}
		return false;
}
	@Override
	public boolean onSearchById(int id) throws SQLException {
		boolean	search=false;
		if(id!=0) {
			search=repo.onSearchById(id);
			return true;
		}
		return false;
	}
	@Override
	public boolean onSearchBySoftwareName(String softwareName) throws SQLException {
		boolean	search=false;
		if(softwareName!=null) {
			search=repo.onSearchBySoftwareName(softwareName);
			return true;
		}
		return false;
	}
	@Override
	public boolean readAll() throws SQLException {
		boolean read=repo.readAll();
		return false;
	}
	@Override
	public boolean onDelete(String softwareName) throws SQLException {
		boolean delete=false;
		if(softwareName!=null) {
			delete=repo.onDelete(softwareName);
		
			return true;
		
		}else {
			return false;
		}
		
	}
	@Override
	public boolean onUpdateByOsVersion(double osVersion, double price) throws SQLException {
		boolean update=false;
		if(osVersion!=0 && price!=0) {
			update= repo.onUpdate(osVersion, price);
		return true;
		}else {
		return false;
	}

	}
	@Override
	public boolean onUpdate(double osVersion, double version) throws SQLException {
		boolean update=false;
		if(osVersion!=0 && version!=0) {
			update= repo.onUpdate(osVersion, version);
		return true;
		}else {
		return false;
	}
		
	}
	@Override
	public boolean onUpdate(int id, String userName, String email, long phoneNumber, String softwareName,
			double version, int DOE, String password, double price, double osVersion) throws SQLException {
		boolean isUpdated = false;
		if (id != 0 && userName!=null && email!=null && phoneNumber!=0 && softwareName!=null && version!=0 && DOE!=0 && password!=null && price!=0 && osVersion!=0) { 
		isUpdated = repo.onUpdate(id,userName,email,phoneNumber,softwareName,version,DOE,password,price,osVersion); 
			System.out.println(isUpdated);
			return true;	
		}else {
			return false;
		
	}
		
	}
}

