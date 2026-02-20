package com.dalfran.Metoa.repository;

import com.dalfran.Metoa.entity.historiqueTrajet.HistoriqueTrajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface historiqueTrajetRepo extends JpaRepository<HistoriqueTrajet, String> {
}
