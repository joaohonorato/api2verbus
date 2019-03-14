/**
 * 
 */
package com.alis.verbus.repositories;

import com.alis.verbus.model.Onibus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

/**
 * Onibus repository for basic operations on Onibus entity.
 * @author Gabriel Honorato
 */
@RepositoryRestResource(exported=false)
public interface OnibusRepository extends PagingAndSortingRepository<Onibus, Long> {
  Optional<Onibus> findById(Long id);
}
