package com.example.demo.repository;

import com.example.demo.domain.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	
}








