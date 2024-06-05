package com.example.springjdbc.dao;

import com.example.springjdbc.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface DaoLayer {
 //   public void ssave(Car car);
    public List<Car> findAll();
    public void delete(String name);
    public List<Car> findByName(String name);
  //  public void update(String name, Car car);
}
