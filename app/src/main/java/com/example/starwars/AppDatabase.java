package com.example.starwars;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.starwars.model.dao.FilmDao;
import com.example.starwars.model.dao.PeopleDao;
import com.example.starwars.model.entity.Film;
import com.example.starwars.model.entity.People;

@Database(entities = { People.class, Film.class }, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PeopleDao getPeopleDao();

    public abstract FilmDao getFilmDao();

}
