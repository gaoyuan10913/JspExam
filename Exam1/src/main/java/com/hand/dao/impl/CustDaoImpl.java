package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.CustDao;
import com.hand.entity.Customer;

public class CustDaoImpl implements CustDao{

	public ResultSet get(Connection conn, Customer cust) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("select * from customer where first_name = ?");
		ps.setString(1, cust.getFirstName());
		return ps.executeQuery();
	}

}
