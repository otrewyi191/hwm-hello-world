package com.example.ntp.dao;

import com.example.ntp.entity.NtpBean;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/9 0009.
 */

public interface INtpDao {
    public void set(NtpBean ntpBean);
    public NtpBean get();
}
