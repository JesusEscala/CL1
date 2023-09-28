package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ejemplo")
@Data
@AllArgsConstructor
@NoArgsConstructor
 class Ejemplo {
	@Id
	private int cod_ejem;
	private String nom_ejem;
	private int id_relacional;
	@ManyToOne
	@JoinColumn(name="id_relacional", insertable = false, updatable = false)
	private Relacional objRelacional;

}