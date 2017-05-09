package com.example.ntp.service;

import com.example.ntp.entity.NtpBean;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/9 0009.
 */

public interface INtpService {
    public void set(NtpBean ntpBean);
    public NtpBean get();
}
