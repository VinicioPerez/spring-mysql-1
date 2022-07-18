package ec.edu.insteclrg.persintence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domin.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
	
	public Ciudad findByNombre(String nombre);

}
