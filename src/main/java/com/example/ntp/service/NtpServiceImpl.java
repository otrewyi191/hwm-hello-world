package com.example.ntp.service;

import com.example.ntp.dao.INtpDao;
import com.example.ntp.entity.NtpBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
@Component
public class NtpServiceImpl implements INtpService {
    @Autowired
    private INtpDao iNtpDao;

    @Override
    public void set(NtpBean ntpBean) {
        iNtpDao.set(ntpBean);
    }

    @Override
    public NtpBean get() {
        return iNtpDao.get();
    }
}
