package com.hand.dao;

import java.util.ArrayList;

import com.hand.entity.Language;

public interface LanguageDao {
	public ArrayList<Language> checkLanguage(String sql);
}
