package org.spring.lili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lili
 * @date 2021/12/20 16:34
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getById")
    public Customer greeting(@RequestParam(value = "id", defaultValue = "1") Integer id) {
        return customerService.getById(id);
    }

    @GetMapping("/greeting")
    public String greeting() {
        return customerService.greet();
    }
}
