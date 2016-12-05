package com.lwzyx.shop.dao;

import com.lwzyx.shop.mapper.GoodMapper;
import com.lwzyx.shop.model.Good;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */
@Repository
public class GoodDao implements IGoodDao {
    private GoodMapper goodMapper;
    @Resource
    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }

    public List<Good> getGoodList() {
        return goodMapper.getGoodList();
    }
}
