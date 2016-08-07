package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hand.dao.FilmDao;
import com.hand.entity.Film;
import com.hand.util.ConnectionDB;

public class FilmDaoImpl implements FilmDao {

	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private Connection conn = null;

	//获取电影
	public ArrayList<Film> getList(String sql) {
		ArrayList<Film> list = new ArrayList<Film>();
		try {
			conn = ConnectionDB.getInstance().makeconnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int film_id = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String language_name = rs.getString(4);
				
				Film film = new Film();
				film.setFilm_id(film_id);
				film.setTitle(title);
				film.setDescription(description);
				film.setLanguage_name(language_name);
				list.add(film);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	//增加电影
	public boolean addFilm(String sql) {
		try {
			conn = ConnectionDB.getInstance().makeconnection();
			stmt = conn.createStatement();
			int rows = stmt.executeUpdate(sql);
			if(rows == 1){
				return true;
			}
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
