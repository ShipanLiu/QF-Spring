package com.qf.service.impl;

import com.qf.dao.HouseDao;
import com.qf.service.HouseService;

public class HouseServiceImpl implements HouseService {

    // you need an instance from Dao
//    private HouseDao houseDao;
    private HouseDao houseDao2;

    // the scope should be public, do not use "private", or the spring can not use this method with xml file
    // 即使你用 autowire， set 方法 也是 必不可少的。

    //if you change the name og the attribute name, please also change the set function name
    public void setHouseDao2(HouseDao houseDao) {
        this.houseDao2 = houseDao;
    }
//    public void setHouseDao(HouseDao houseDao) {
//        this.houseDao2 = houseDao;
//    }


    @Override
    public void findHouseById() {

        houseDao2.findHouseById();
    }
}
