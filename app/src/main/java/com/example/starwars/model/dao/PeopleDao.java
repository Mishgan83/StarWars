package com.example.starwars.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import com.example.starwars.model.entity.People;

@Dao
public interface PeopleDao {

    @Query("SELECT * FROM peoples")
    List<People> getAllPeoples();

    @Query("SELECT * FROM peoples WHERE id = :id")
    People getPeople(Long id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(People people);

}
