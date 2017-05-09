package com.example.ntp.dao;

import com.example.ntp.entity.NtpBean;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/9 0009.
 */

@Component
public class NtpDaoImpl implements INtpDao {
    private NtpBean ntpBean;

    @Override
    public void set(NtpBean ntpBean) {
        this.ntpBean=ntpBean;
    }

    @Override
    public NtpBean get() {
        return this.ntpBean;
    }
}
