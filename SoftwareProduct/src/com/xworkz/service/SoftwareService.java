package com.xworkz.service;

import java.sql.SQLException;

import com.xworkz.dto.SoftwareDto;

public interface SoftwareService {
public boolean validteAndSave(SoftwareDto dto) throws SQLException;
public boolean onSearchByProductVersion(Double productVersion) throws SQLException ;
public boolean onSearchById(int id) throws SQLException ;
public boolean onSearchBySoftwareName(String softwareName) throws SQLException ;
public boolean readAll() throws SQLException;
boolean onDelete(String softwareName) throws SQLException;
boolean onUpdateByOsVersion(double osVersion,double price) throws SQLException;
boolean onUpdate(double osVersion,double version) throws SQLException;
boolean onUpdate(int id,String userName,String email,long phoneNumber,String softwareName,double version,int DOE,String password,double price,double osVersion) throws SQLException;


}
