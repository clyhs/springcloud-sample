package com.springcloud.ribbon;


import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springcloud.ribbon.bean.Foo;
import com.springcloud.ribbon.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UnitTestService {
	@Autowired
	HelloService dcs;
	
	@Rule
    public ContiPerfRule contiPerfRule = new ContiPerfRule();
	
	@Test
    //10个线程 执行1000次
    @PerfTest(invocations = 1000,threads = 100)
    public void test() {
        Foo f = dcs.getFoo();
        
    }

}
