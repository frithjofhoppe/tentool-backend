package com.hofr.tentoolbackend.database.repository;

import com.hofr.tentoolbackend.database.model.Ada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdaRepository extends JpaRepository<Ada, Long> {
}
