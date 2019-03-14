/**
 * 
 */
package com.alis.verbus.service;

import com.alis.verbus.model.Onibus;

import java.util.List;

/**
 * OnibusService interface for Onibus.
 * @author Gabriel Honorato
 *
 */
public interface OnibusService {
  public List<Onibus> getAll();
  
  public Onibus save(Onibus p);
  
  public Onibus findById(Long personId);
  
}
