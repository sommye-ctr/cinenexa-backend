package com.cinenexa.cinenexabackend.repositories;

import com.cinenexa.cinenexabackend.models.Extension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtensionRepository extends JpaRepository<Extension, Long> {
}
