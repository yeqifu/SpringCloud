package com.yeqifu.springcloud.service.impl;

import com.yeqifu.springcloud.dao.PaymentDao;
import com.yeqifu.springcloud.entities.Payment;
import com.yeqifu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 落亦-
 * @Date: 2020/7/29 20:35
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    /**
     * 插入一条payment
     * @param payment
     * @return
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    /**
     * 根据id删除一条记录
     * @param id
     * @return
     */
    @Override
    public int deletePaymentById(Long id){
        return paymentDao.deletePaymentById(id);
    }

    /**
     * 根据Payment修改一条记录
     * @param payment
     * @return
     */
    @Override
    public int updatePaymentById(Payment payment){
        return paymentDao.updatePaymentById(payment);
    }

    /**
     * 根据id查询出一条记录
     * @param id
     * @return
     */
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
