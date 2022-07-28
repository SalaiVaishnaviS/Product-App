package App.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import App.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
