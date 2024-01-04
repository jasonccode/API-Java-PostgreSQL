package crudjava.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {
    @GetMapping
    public List<Product> getProducts() {
        return List.of(
                new Product(
                        1L,
                        "Laptop",
                        500,
                        LocalDate.of(2025, Month.MARCH, 5),
                        2
                ));
    }
}
