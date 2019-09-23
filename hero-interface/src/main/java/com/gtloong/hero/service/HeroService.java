package com.gtloong.hero.service;

import com.gtloong.hero.pojo.Hero;

import java.util.List;

public interface HeroService {

    public Hero save(Hero hero);
    public Hero getById(Integer id);
    public void deleteById(Integer id);
    public List<Hero> getByName(String name);
    public List<Hero> getAll();
 }
