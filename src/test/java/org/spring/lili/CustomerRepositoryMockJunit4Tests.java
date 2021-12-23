package org.spring.lili;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

/**
 * CustomerRepositoryMockJunit4Tests使用继承AbstractJUnit4SpringContextTests或者@RunWith(SpringRunner.class)均可以运行起来
 * @author lili
 * @date 2021/12/22 19:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
//@TestExecutionListeners({MockitoTestExecutionListener.class, ResetMocksTestExecutionListener.class})
public class CustomerRepositoryMockJunit4Tests {
    @MockBean
    private CustomerRepository customerRepository;

    @Test
    public void testFindById() {
//        运行该测试需要注释掉 build.gradle的useJUnitPlatform()
        Customer customer = new Customer("first", "last");

        when(customerRepository.findById(Mockito.anyLong())).thenReturn(customer);

        Customer cm = customerRepository.findById(1);

        System.out.println(cm);


    }
}
