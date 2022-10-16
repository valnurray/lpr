package com.lankin.lpr.repository;

import com.lankin.lpr.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
