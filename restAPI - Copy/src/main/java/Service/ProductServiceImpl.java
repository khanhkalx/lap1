package Service;

import Entity.Product;
import Entity.User;
import com.example.restAPI.Exception.NotFoundException;
import com.example.restAPI.model.dto.UserDto;
import com.example.restAPI.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService{

    private static ArrayList<Product> list = new ArrayList<Product>();
    private static UserDto people;

    static {
        people = new UserDto();
        people.setName("Leo");

        list.add(new Product(123, "Bime", 500.2, "Le-Xa",people));
        list.add(new Product(124, "Bime", 200.2, "Le-Xa",people));
        list.add(new Product(125, "Bime", 300.2, "Le-Xa",people));
    }

    @Override
    public List<Product> getListProduct() {
        return list;
    }

    @Override
    public Product getProductById(int id) {
        for(Product product: list){
            if(product.getId() == id){
                return product;
            }
        }
        throw new NotFoundException("Product không tồn tại");
    }

    @Override
    public List<Product> SearchProduct(String keyword) {
        List<Product> arr = new ArrayList<Product>();
        for(Product product: list){
            if(product.getName().contains(keyword)){
                arr.add(product);
            }
        }
        return arr;
    }
}
