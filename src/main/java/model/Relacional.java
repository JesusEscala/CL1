package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table (name="tb_relacional")
@Data
public class Relacional {
	@Id
	private int id_relacional;
	private String descripcion;
}