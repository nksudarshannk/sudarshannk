package com.example.restapiMysql.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.restapiMysql.model.SModel;

public interface Srepo extends CrudRepository<SModel, Integer> {

}
