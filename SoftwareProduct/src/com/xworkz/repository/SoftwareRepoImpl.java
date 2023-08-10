package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.dto.SoftwareDto;
import com.xworkz.util.SoftwareUtil;

public class SoftwareRepoImpl implements SoftwareRepo {
SoftwareUtil util=new SoftwareUtil();
	@Override
	public boolean validteAndSave(SoftwareDto dto) throws SQLException {
		Connection connection=DriverManager.getConnection(util.jdbcUrl, util.userName, util.password);
		String query="insert into softwareproduct values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		  System.out.println("Before:"+preparedStatement);
		  
		  preparedStatement.setInt(1,dto.getId() );
		  preparedStatement.setString(2,dto.getUserName() );
		  preparedStatement.setString(3,dto.getEmail() );
		  preparedStatement.setLong(4,dto.getPhoneNumber() );
		  preparedStatement.setString(5,dto.getSoftwareName() );
		  preparedStatement.setDouble(6,dto.getVersion() );
		  preparedStatement.setInt(7,dto.getDOE());
		  preparedStatement.setString(8,dto.getPassword() );
		  preparedStatement.setDouble(9,dto.getPrice() );
		  preparedStatement.setDouble(10,dto.getOsVersion() );
		  
		  System.out.println("After:"+preparedStatement);
		  int rows=preparedStatement.executeUpdate();
			if(rows>0) {
				return true;
			}
			else {
				return false;
			}
	}
	
public boolean onSearchByProductVersion(Double version) throws SQLException {
		
		Connection connection=DriverManager.getConnection(util.jdbcUrl,util.userName,util.password);
		String query="select * from softwareproduct  where version=?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setDouble(1, version);
		System.out.println(preparedStatement);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println("ProductVersion:"+resultSet.getString(1));
		
		}
		return false;
	}

@Override
public boolean onSearchById(int id) throws SQLException {
	Connection connection=DriverManager.getConnection(util.jdbcUrl,util.userName,util.password);
	String query="select * from softwareproduct  where id=?";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	preparedStatement.setInt(1, id);
	System.out.println(preparedStatement);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		System.out.println("Id:"+resultSet.getInt(1));
	
	
}
	return false;
	
}

@Override
public boolean onSearchBySoftwareName(String softwareName) throws SQLException {
	Connection connection=DriverManager.getConnection(util.jdbcUrl,util.userName,util.password);
	String query="select * from softwareproduct  where softwareName=?";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	preparedStatement.setString(1, softwareName);
	System.out.println(preparedStatement);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		System.out.println("softwareName:"+resultSet.getString(1));
	}
	return false;
}

@Override
public boolean readAll() throws SQLException {
	Connection connection = DriverManager.getConnection(util.jdbcUrl, util.userName, util.password);
	String query = "select * from  softwareproduct";
	PreparedStatement preparedStatement = connection.prepareStatement(query);
	ResultSet result = preparedStatement.executeQuery();
	while(result.next()) {
		System.out.println(" Id: "+result.getInt(1)+" userName: "+result.getString(2)+ " email: " +result.getString(3)+ " phoneNumber: "+result.getLong(4)+ " softwareName: " +result.getString(5)+ " version : "+result.getDouble(6)+ " DOE: "+result.getInt(7)+ " password: "+result.getString(8)+" price: "+result.getDouble(9)+" osVersion: "+result.getDouble(10));
	
	
}
	return false;
}

@Override
public boolean onDelete(String softwareName) throws SQLException {
	
	Connection connection=DriverManager.getConnection(util.jdbcUrl,util.userName,util.password);
	String query="delete from softwareproduct  where softwareName=?";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	preparedStatement.setString(1, softwareName);
	
	
	int rows=preparedStatement.executeUpdate();
	if(rows>0) {
		return true;
	}else {
	return false;
}

}

@Override
public boolean onUpdateByOsVersion(double osVersion, double price) throws SQLException {
	Connection connection=DriverManager.getConnection(util.jdbcUrl,util.userName,util.password);
	String query="update softwareproduct set price=? where osVersion=?";
	
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	System.out.println("before:"+preparedStatement);
	 preparedStatement.setDouble(1, price);
	 preparedStatement.setDouble(2,osVersion);
	 System.out.println("after:"+preparedStatement);
	 
	 preparedStatement.executeUpdate();
	 
	return false;

}

@Override
public boolean onUpdate(double osVersion, double version) throws SQLException {
	Connection connection=DriverManager.getConnection(util.jdbcUrl,util.userName,util.password);
	String query="update softwareproduct set version=? where osVersion=?";
	
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	System.out.println("before:"+preparedStatement);
	 preparedStatement.setDouble(1, version);
	 preparedStatement.setDouble(2,osVersion);
	 System.out.println("after:"+preparedStatement);
	 
	 preparedStatement.executeUpdate();
	 
	return false;
}

@Override
public boolean onUpdate(int id, String userName, String email, long phoneNumber, String softwareName, double version,
		int DOE, String password, double price, double osVersion) throws SQLException {
	Connection connection = DriverManager.getConnection(util.jdbcUrl, util.userName, util.password);

	String query = "update softwareproduct set userName=?,email=?,phoneNumber=?,softwareName=?,version=?,DOE=?,password=?,price=?,osVersion=? where id=?";

	PreparedStatement preparedstatement = connection.prepareStatement(query);
	System.out.println("before:" + preparedstatement);
	preparedstatement.setString(1,userName);
	preparedstatement.setString(2,email);
	preparedstatement.setLong(3,phoneNumber);
	preparedstatement.setString(4,softwareName);
	preparedstatement.setDouble(5,version);
	preparedstatement.setInt(6,DOE);
	preparedstatement.setString(7,password);
	preparedstatement.setDouble(8,price);
	preparedstatement.setDouble(9,osVersion);
	preparedstatement.setInt(10,id);
	System.out.println("after:" + preparedstatement);

	preparedstatement.executeUpdate();
	return true;
	
}
}


