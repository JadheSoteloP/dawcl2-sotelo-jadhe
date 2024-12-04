package pe.edu.cibertec.dawcl2_sotelo_jadhe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dawcl2_sotelo_jadhe.dto.FilmDto;
import pe.edu.cibertec.dawcl2_sotelo_jadhe.entity.Film;
import pe.edu.cibertec.dawcl2_sotelo_jadhe.repository.FilmRepository;
import pe.edu.cibertec.dawcl2_sotelo_jadhe.service.MaintenanceService;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    FilmRepository filmRepository;

    @Override
    public List<FilmDto> findAllFims() {

        List<FilmDto> films = new ArrayList<FilmDto>();
        Iterable<Film> iterable = filmRepository.findAll();
        iterable.forEach(film -> {
            FilmDto filmDto = new FilmDto(film.getFilmId(),
                    film.getTitle(),
                    film.getLanguage().getName(),
                    film.getRentalRate());
            films.add(filmDto);
        });
        return films;
    }
}
