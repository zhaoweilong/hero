package com.gtloong.hero.provider.service;

import com.gtloong.hero.provider.domain.HeroDomain;
import com.gtloong.hero.pojo.Hero;
import com.gtloong.hero.provider.repository.HeroRepository;
import com.gtloong.hero.service.HeroService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService{

    @Autowired
    HeroRepository heroRepository;
    @Override
    public Hero save(Hero hero) {
        return heroRepository.save(HeroDomain.FromDTO(hero)).toDTO();
    }

    @Override
    public Hero getById(Integer id) {
        return heroRepository.getOne(id).toDTO();
    }

    @Override
    public void deleteById(Integer id) {
         heroRepository.deleteById(id);
    }

    @Override
    public List<Hero> getByName(String name) {
        return heroRepository.getByName(name);
    }

    @Override
    public List<Hero> getAll() {
        return heroRepository.getALL();
    }
}