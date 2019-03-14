/**
 * 
 */
package com.alis.verbus.service;

import com.alis.verbus.model.Onibus;
import com.alis.verbus.repositories.OnibusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementacao do servico Onibus
 * @author Gabriel Honorato
 *
 */
@Service
public class OnibusServiceImpl implements OnibusService{

  @Autowired
  OnibusRepository onibusRepository;
  
  /* (non-Javadoc)
   * @see com.alis.verbus.service.OnibusService#getAll()
   */
  @Override
  public List<Onibus> getAll() {
    List<Onibus> personList = new ArrayList<>();
    onibusRepository.findAll().forEach(personList::add);
    return personList;
    
  }

  /* (non-Javadoc)
  * @see com.alis.verbus.service.OnibusService#findById()
  */
  public Onibus save(Onibus p) {
    return onibusRepository.save(p);
  }

  /* (non-Javadoc)
   * @see com.alis.verbus.service.OnibusService#findById()
   */
  @Override
  public Onibus findById(Long personId) {
    Optional<Onibus> dbPerson = onibusRepository.findById(personId);
    return dbPerson.orElse(null);
  }
  
  

}
