package com.xworkz.snapchatapp.repository;

import java.sql.SQLException;

import com.xworkz.snapchatapp.dto.SnapDto;

public interface SnapRepo {
	public	boolean onSave(SnapDto dto) throws SQLException;

}
