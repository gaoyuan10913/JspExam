package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hand.dao.LanguageDao;
import com.hand.entity.Language;
import com.hand.util.ConnectionDB;

public class LanguageDaoImpl implements LanguageDao {
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Connection conn = null;

	public ArrayList<Language> checkLanguage(String sql) {
		ArrayList<Language> list = new ArrayList<Language>();
		try {
			conn = ConnectionDB.getInstance().makeconnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int language_id = rs.getInt(1);
				String language_name = rs.getString(2);
				Language language = new Language();
				language.setLanguageID(language_id);
				language.setName(language_name);
				list.add(language);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
