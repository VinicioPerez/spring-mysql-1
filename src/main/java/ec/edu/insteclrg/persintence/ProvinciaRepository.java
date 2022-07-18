package ec.edu.insteclrg.persintence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domin.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, Long>{
	
	public Provincia findByNombre(String nom);

}
