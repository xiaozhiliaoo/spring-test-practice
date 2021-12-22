package org.spring.lili;

/**
 * @author lili
 * @date 2021/12/20 16:23
 */

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
