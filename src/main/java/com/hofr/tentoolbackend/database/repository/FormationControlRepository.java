package com.hofr.tentoolbackend.database.repository;

import com.hofr.tentoolbackend.database.model.FormationControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationControlRepository extends JpaRepository<FormationControl, Long> {
}
