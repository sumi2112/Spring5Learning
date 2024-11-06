package com.learning.sumi.Spring5Learning.repository;

import com.learning.sumi.Spring5Learning.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
