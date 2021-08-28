package com.myvoozparser.repositories;

import com.myvoozparser.entitys.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface TypeRepository extends JpaRepository<Type, Integer> {
}
