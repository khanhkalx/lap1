package Service;

import Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public List<Product> getListProduct();
    public Product getProductById(int id);
    public List<Product> SearchProduct(String keyword);
}
