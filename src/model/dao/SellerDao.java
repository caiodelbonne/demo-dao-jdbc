package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); // consultar no bD se existir retorna se nao volta null
	List<Seller> findAll();
}
// ctrl F troca 