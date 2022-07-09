package ec.edu.insteclrg.dto;

import lombok.Data;

@Data
public class CiudadDTO {
	
	private Long idCiudad;
	
	private String nombreCiudad;

	private ProvinciaDTO provincia;

}
