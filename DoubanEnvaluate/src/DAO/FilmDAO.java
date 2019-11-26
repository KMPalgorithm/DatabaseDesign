package DAO;

import java.util.List;
import domain.*;

public interface FilmDAO {
	public void insertFilm(Film film);
	public void updateFilm(Film film);
	public void deleteFilm(String fid);
	public Film getFilm(String fid);
	public List<Film> getFilmByC(String sql);
}
