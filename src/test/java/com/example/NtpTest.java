package com.example;

import com.example.ntp.controller.Ntp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HwmApplication.class)
public class NtpTest {
    @Autowired
    private Ntp ntp;

    @Test
    public void contextLoad(){
        String ntpip="1.1.1.1";
        ntp.set(ntpip);
        String s = ntp.get();
        assert (s.equals(ntpip));
    }
}
