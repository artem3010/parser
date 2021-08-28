package com.myvoozparser.repositories;

import com.myvoozparser.entitys.Corpus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorpusRepository extends JpaRepository<Corpus, Integer> {
}
