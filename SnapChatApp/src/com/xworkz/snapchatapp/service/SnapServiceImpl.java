package com.xworkz.snapchatapp.service;

import java.sql.SQLException;


import com.xworkz.snapchatapp.dto.SnapDto;
import com.xworkz.snapchatapp.repository.SnapRepo;
import com.xworkz.snapchatapp.repository.SnapRepoImpl;

public class SnapServiceImpl implements SnapService{

		SnapRepo repo=new SnapRepoImpl();
		@Override
		public boolean onSave(SnapDto dto) throws SQLException {
			if(dto!=null) {
				System.out.println("dto");
				boolean  save=repo.onSave(dto);
				return  true;
			}else {
			return false;
	
	}

		}
}
