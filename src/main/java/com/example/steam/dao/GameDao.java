package com.example.steam.dao;

import com.example.steam.entity.Game;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.security.PermitAll;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-27
 * @time: 11:03
 */
@Repository
public interface GameDao {

    @Select("select * from game where id=#{id}")
    Game findGameById(@Param("id")long id);

    @Select("select * from game limit 0,12")
    List<Game> findGamesFeatured();

    @Select("select * from game where discount>0 limit 0,12")
    List<Game> findSpecialGames();

    @Select("select * from game where issuedstatu>0 order by issueddate desc limit 0,10")
    List<Game> findNewReleaseGameToIndex();

    @Select("select * from game where issuedstatu>0 order by sellnum desc limit 0,10")
    List<Game> findHotSellGameToIndex();

    @Select("select * from game where issuedstatu=0 order by issueddate desc limit 0,10")
    List<Game> findUpComingGameToIndex();

}