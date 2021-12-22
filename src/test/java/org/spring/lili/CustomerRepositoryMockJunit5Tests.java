package org.spring.lili;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

/**
 * @author lili
 * @date 2021/12/22 18:09
 */
@SpringBootTest
class CustomerRepositoryMockJunit5Tests {

    @MockBean
    private CustomerRepository customerRepository;

    @Test
    void testFindById() {
        Customer customer = new Customer("first", "last");

        when(customerRepository.findById(Mockito.anyLong())).thenReturn(customer);

        Customer cm = customerRepository.findById(1);

        System.out.println(cm);


    }
}
