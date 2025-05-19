package az.edu.itbrains.ecommerce.services;

import az.edu.itbrains.ecommerce.dtos.product.ProductCreateDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductRecentDto;
import az.edu.itbrains.ecommerce.payloads.ApiResponse;

import java.util.List;

public interface ProductService {
    List<ProductRecentDto> getRecentProducts();

    ApiResponse create(ProductCreateDto productCreateDto);
}
