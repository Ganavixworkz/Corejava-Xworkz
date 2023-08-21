package com.xworkz.snapchatapp.service;

import java.sql.SQLException;

import com.xworkz.snapchatapp.dto.SnapDto;


public interface SnapService {
	public	boolean onSave(SnapDto dto) throws SQLException;

}
