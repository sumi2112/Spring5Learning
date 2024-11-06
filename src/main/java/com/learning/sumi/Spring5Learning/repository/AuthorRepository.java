package com.learning.sumi.Spring5Learning.repository;

import com.learning.sumi.Spring5Learning.model.Author;
import org.springframework.data.repository.CrudRepository;

/*Here we are using Repository Pattern to create a repository for our entity Author. This repository will provide all
the hibernate functions we require to perform CRUD operations on the entity. CrudRepository is in SpringData JPA. It is
an interface with all the functions, underlying SpringData code will provide implementation for these methods.
CrudRepository takes two generic type- 1)Entity the repository will serve 2)Datatype of Primary Key for the Entity.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
