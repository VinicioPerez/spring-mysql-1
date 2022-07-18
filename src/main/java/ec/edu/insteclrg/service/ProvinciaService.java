package ec.edu.insteclrg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.insteclrg.domin.Provincia;
import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.persintence.ProvinciaRepository;

@Service
public class ProvinciaService {
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	public void guardar(ProvinciaDTO provinciaDto) {
		
		Provincia provincia = new Provincia();
		provincia.setId(provinciaDto.getId());
		provincia.setNombre(provinciaDto.getNombre());
		
		provinciaRepository.save(provincia);
	}
}
