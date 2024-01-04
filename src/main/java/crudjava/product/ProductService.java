package crudjava.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    public ResponseEntity<Object> newProduct(Product product) {
        Optional<Product> res = productRepository.findProductByName(product.getName());
        HashMap<String, Object> datos = new HashMap<>();
        if (res.isPresent() && product.getId() == null) {
            datos.put("error", true);
            datos.put("message", "Ya existe un producto con ese nombre");

            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT);
        }
        datos.put("message", "Se guardo con éxito");
        if (product.getId() != null) {
            datos.put("message", "Se actualizó con éxito");

        }
        productRepository.save(product);
        datos.put("data", product);

        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED);
    }
}
