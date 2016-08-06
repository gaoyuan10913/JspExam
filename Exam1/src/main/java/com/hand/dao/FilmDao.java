package com.hand.dao;

import java.util.ArrayList;

import com.hand.entity.Film;

public interface FilmDao {
	public ArrayList<Film> getList(String sql);
}
