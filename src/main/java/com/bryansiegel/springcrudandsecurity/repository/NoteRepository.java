package com.bryansiegel.springcrudandsecurity.repository;

import com.bryansiegel.springcrudandsecurity.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
