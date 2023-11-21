package org.wiley.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wiley.entity.Supplier;

/* *
 * Giovanni De Franceschi
 * Wiley Edge 2023
 * */

@Repository
public interface SuppliersRepo extends JpaRepository<Supplier, Integer> {
}
