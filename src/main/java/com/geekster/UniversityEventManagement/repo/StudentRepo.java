package com.geekster.UniversityEventManagement.repo;

import com.geekster.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface StudentRepo extends CrudRepository<Student, Integer> {

}
