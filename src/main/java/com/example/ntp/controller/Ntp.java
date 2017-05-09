package com.example.ntp.controller;

import com.example.ntp.entity.NtpBean;
import com.example.ntp.service.INtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/9 0009.
 */

@RestController
@RequestMapping("/ntp")
public class Ntp {
    @Autowired
    private INtpService iNtpService;

    @RequestMapping("/set/{ntpserver}")
    public void set(@PathVariable String ntpserver)
    {
        NtpBean ntpBean=new NtpBean();
        ntpBean.setNtpserver(ntpserver);
        iNtpService.set(ntpBean);
    }

    @RequestMapping("/get")
    public String get()
    {
        NtpBean ntpBean=iNtpService.get();
        return ntpBean.getNtpserver();
    }


}
