package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import type.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
