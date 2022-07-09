package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domin.Provincia;
import lombok.Data;

@Data
public class CiudadDTO {
	
	private Long idCiudad;
	
	private String nombreCiudad;

	private Provincia idProvincia;

}
