package com.example.withoutapi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.withoutapi.model.SModel;

public interface Srepo extends CrudRepository<SModel, Integer> {

}
