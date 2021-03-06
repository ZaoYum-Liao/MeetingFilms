package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.*;

import java.util.List;

/**
 * 用于异步调用的接口
 */
public interface FilmServiceAsynAPI {

    /**
     * 获取轮播图信息
     * @return 轮播图
     */
    List<BannerVo> getBanners();

    /**
     * 获取正在热映的电影
     * @param isLimit 限制数目
     * @param nums 数目
     * @return 热映电影s
     */
    FilmVo getHotFilms(boolean isLimit, int nums);

    /**
     * 即将上映的电影
     * @param isLimit 限制数目
     * @param nums 数目
     * @return 即将上映的电影s
     */
    FilmVo getSoonFilms(boolean isLimit, int nums);

    /**
     * 票房排行榜
     * @return 排行榜上的电影信息
     */
    List<FilmInfoVo> getBoxRanking();

    /**
     * 获取受欢迎的榜单
     * @return 受欢迎的电影信息
     */
    List<FilmInfoVo> getExpectRanking();

    /**
     * 获取前100个电影的信息
     * @return 前100个电影的信息
     */
    List<FilmInfoVo> getTop();

    /**
     * 获取电影简介
     * @param filmId
     * @return
     */
    String getBiography(int filmId);

    /**
     * 获取导演演员信息
     * @param filmId
     * @return
     */
    FilmActorsVO getDirectorAndActors(int filmId);

    /**
     * 获取图集
     * @param filmId
     * @return
     */
    ImgsVO getImgs(int filmId);
}
