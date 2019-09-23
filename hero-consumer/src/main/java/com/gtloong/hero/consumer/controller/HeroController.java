package com.gtloong.hero.consumer.controller;

import com.gtloong.hero.pojo.Hero;
import com.gtloong.hero.service.HeroService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {
    @Reference
    HeroService heroService;

    @RequestMapping("/save")
    public Hero save(Hero hero) {
        return heroService.save(hero);
    }

    @RequestMapping("/getById")
    public Hero getById(Integer id) {
        return heroService.getById(id);
    }

    @RequestMapping("/deleteById")
    public void deleteById(Integer id) {
        heroService.deleteById(id);
    }
    @RequestMapping("/getByName")
    public List<Hero> getByName(String name) {
        return heroService.getByName(name);
    }
    @RequestMapping("/getAll")
    public List<Hero> getAll() {
        return heroService.getAll();
    }
}
