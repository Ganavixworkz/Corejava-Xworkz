package com.xworkz.snapchatapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.snapchatapp.dto.SnapDto;
import com.xworkz.snapchatapp.util.SnapUtil;

public class SnapRepoImpl implements SnapRepo{
SnapUtil jdbc=new SnapUtil();
	@Override
	public boolean onSave(SnapDto dto) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
Connection connection=DriverManager.getConnection(jdbc.jdbcUrl,jdbc.userName,jdbc.password);
		
		String query="insert into snapchat values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		System.out.println(preparedStatement);
		
		preparedStatement.setInt(1,dto.getUserId());
		preparedStatement.setString(2,dto.getEmail());
		preparedStatement.setLong(3,dto.getPhoneNumber());
		preparedStatement.setString(4,dto.getUserName());
		preparedStatement.setString(5,dto.getPassword());
		preparedStatement.setString(6,dto.getAddress());
		preparedStatement.setString(7,dto.getCountry());
		preparedStatement.setString(8,dto.getGender());
		preparedStatement.setString(9,dto.getDob());
		preparedStatement.setBoolean(10,dto.isAccountType());
		
	System.out.println(preparedStatement);
		
		int rows=preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
		}
		else {
		return false;
	}

	}
}
