package com.yeqifu.springcloud.dao;

import com.yeqifu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: 落亦-
 * @Date: 2020/7/29 19:55
 */
@Mapper
public interface PaymentDao {
    /**
     * 插入一条payment
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id删除一条记录
     * @param id
     * @return
     */
    public int deletePaymentById(@Param("id") Long id);

    /**
     * 根据Payment修改一条记录
     * @param payment
     * @return
     */
    public int updatePaymentById(Payment payment);

    /**
     * 根据id查询出一条记录
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
