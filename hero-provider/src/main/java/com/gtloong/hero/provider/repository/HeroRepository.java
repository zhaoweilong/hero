package com.gtloong.hero.provider.repository;


import com.gtloong.hero.provider.domain.HeroDomain;
import com.gtloong.hero.pojo.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends JpaRepository<HeroDomain, Integer> {

    @Query("select new com.gtloong.hero.pojo.Hero(t.id,t.name) from HeroDomain t where t.name like :name")
    public List<Hero> getByName(@Param("name") String name);

    @Query("select new com.gtloong.hero.pojo.Hero(t.id,t.name) from HeroDomain t")
    public List<Hero> getALL();

}
