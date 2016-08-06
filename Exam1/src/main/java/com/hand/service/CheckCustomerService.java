package com.hand.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.hand.dao.CustDao;
import com.hand.dao.impl.CustDaoImpl;
import com.hand.entity.Customer;
import com.hand.util.ConnectionDB;

public class CheckCustomerService {
	
	private CustDao custDao = new CustDaoImpl();
	
	public boolean check(Customer cust){
		Connection conn = null;
		try {
			conn = ConnectionDB.getInstance().makeconnection();
			conn.setAutoCommit(false);
			
			ResultSet resultSet = custDao.get(conn, cust);
			
			while(resultSet.next()){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally{
			try {
				conn.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		
		return false;
		
	}
}
