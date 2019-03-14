package com.alis.verbus.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "onibuses")
public class Onibus implements Serializable {

  private static final long serialVersionUID = 7401548380514451401L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id", unique=true, nullable=false)
  private Long id;


  private Calendar datahora;
  private String ordem;
  private String linha;
  private Double latitude;
  private Double longitude;
  private Double velocidade;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Calendar getDatahora() {
    return datahora;
  }

  public void setDatahora(Calendar datahora) {
    this.datahora = datahora;
  }

  public String getOrdem() {
    return ordem;
  }

  public void setOrdem(String ordem) {
    this.ordem = ordem;
  }

  public String getLinha() {
    return linha;
  }

  public void setLinha(String linha) {
    this.linha = linha;
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Double getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(Double velocidade) {
    this.velocidade = velocidade;
  }

  @Override
  public String toString() {
    return "Onibus{" +
            "id=" + id +
            ", datahora=" + datahora +
            ", ordem='" + ordem + '\'' +
            ", linha='" + linha + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", velocidade=" + velocidade +
            '}';
  }
}
