package com.gtloong.hero.provider.domain;

import com.gtloong.hero.pojo.Hero;

import javax.persistence.*;

@Entity
public class HeroDomain  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;

    public HeroDomain(Integer id,String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Hero toDTO(){
        return new Hero(this.id,this.name);
    }
    public static HeroDomain FromDTO(Hero hero){
        return new HeroDomain(hero.getId(),hero.getName());
    }
}
