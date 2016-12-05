package com.lwzyx.shop.mapper;

import com.lwzyx.shop.model.Good;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/12/3.
 */

public interface GoodMapper {
    public List<Good> getGoodList();
}
