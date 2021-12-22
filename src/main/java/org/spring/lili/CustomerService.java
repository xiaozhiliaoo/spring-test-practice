package org.spring.lili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lili
 * @date 2021/12/20 16:35
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;


    public Customer getById(Integer id) {
        return repository.findById(id);
    }

    public String greet() {
        return "Hello, World";
    }
}
