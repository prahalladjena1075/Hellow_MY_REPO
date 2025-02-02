package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import type.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
