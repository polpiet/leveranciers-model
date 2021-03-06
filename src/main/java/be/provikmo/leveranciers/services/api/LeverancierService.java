/**
 * (c) 2016 ADMB. All rights reserved.
 */
package be.provikmo.leveranciers.services.api;

import java.util.List;

import org.springframework.stereotype.Service;

import be.provikmo.leveranciers.model.Artikel;
import be.provikmo.leveranciers.model.Leverancier;

/**
 * @author Glenn Lefevere
 *
 */
@Service
public interface LeverancierService {

	List<Leverancier> findAll();

	Leverancier findById(String id);

	Leverancier save(Leverancier leverancier);

	Leverancier findByIdJoinArtikel(String id);

	List<Leverancier> findByNaam(String query);

	void addArtikelToLeverancier(String id, Artikel artikel);
}
