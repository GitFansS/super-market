package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Good;
import com.soft1841.sm.entity.Vip;
import com.soft1841.sm.utils.DAOFactory;
import org.junit.Test;
import java.sql.SQLException;
import java.util.List;

/**
 * 会员信息管理的测试
 * @author 侯粤嘉
 */

public class VipDAOTest {

    private VipDAO vipDAO = DAOFactory.getVipDAOInstance();


    @Test
    public void selectVip() throws SQLException {
        List<Vip>  vipList = vipDAO.selectVip();
        vipList.forEach(entity -> System.out.println());
    }


    @Test
    public void deleteById() throws SQLException{
        vipDAO.deleteById(1);
    }

    @Test
    public void insertVip() throws SQLException{
        Vip vip = new Vip();
        vip.setName("测试会员名字");
        System.out.println(vipDAO.insertVip(vip));

    }
}
