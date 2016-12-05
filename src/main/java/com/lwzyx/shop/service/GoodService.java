package com.lwzyx.shop.service;

import com.lwzyx.shop.dao.IGoodDao;
import com.lwzyx.shop.model.Good;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */
@Service
public class GoodService implements IGoodService {
    private IGoodDao goodDao;
    @Resource
    public void setGoodDao(IGoodDao goodDao) {
        this.goodDao = goodDao;
    }

    public List<Good> findGoods() {
        return goodDao.getGoodList();
    }
}
