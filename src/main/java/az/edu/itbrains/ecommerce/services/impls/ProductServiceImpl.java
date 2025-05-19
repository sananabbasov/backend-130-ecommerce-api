package az.edu.itbrains.ecommerce.services.impls;

import az.edu.itbrains.ecommerce.dtos.product.ProductCreateDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductRecentDto;
import az.edu.itbrains.ecommerce.models.Category;
import az.edu.itbrains.ecommerce.models.Product;
import az.edu.itbrains.ecommerce.payloads.ApiResponse;
import az.edu.itbrains.ecommerce.repositories.ProductRepository;
import az.edu.itbrains.ecommerce.services.CategoryService;
import az.edu.itbrains.ecommerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;
    @Override
    public List<ProductRecentDto> getRecentProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductRecentDto> productRecentDtoList = products.stream().map(product -> modelMapper.map(product, ProductRecentDto.class)).collect(Collectors.toList());
        return productRecentDtoList;
    }

    @Override
    public ApiResponse create(ProductCreateDto productCreateDto) {
        try {
            Product product = new Product();
            product.setName(productCreateDto.getName());
            product.setPrice(productCreateDto.getPrice());
            product.setDiscountPrice(productCreateDto.getDiscountPrice());
            product.setShortDescription(productCreateDto.getShortDescription());
            product.setDescription(productCreateDto.getDescription());
            product.setInformation(productCreateDto.getInformation());
            Category category = categoryService.getCategoryById(productCreateDto.getCategoryId());
            product.setCategory(category);
            productRepository.save(product);
            return new ApiResponse("Product created successfully", true, HttpStatus.CREATED);
        }catch (Exception error){
            return new ApiResponse(error.getMessage(), false, HttpStatus.BAD_REQUEST);
        }
    }
}
