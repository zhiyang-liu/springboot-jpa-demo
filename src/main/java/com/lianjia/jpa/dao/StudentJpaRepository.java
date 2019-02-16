package com.lianjia.jpa.dao;

import com.lianjia.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student, Integer> {
}
