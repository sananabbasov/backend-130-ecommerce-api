package az.edu.itbrains.ecommerce.controllers;

import az.edu.itbrains.ecommerce.dtos.category.CategoryCreateDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductCreateDto;
import az.edu.itbrains.ecommerce.dtos.product.ProductRecentDto;
import az.edu.itbrains.ecommerce.payloads.ApiResponse;
import az.edu.itbrains.ecommerce.services.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @PostMapping("/create")
    public ResponseEntity<ApiResponse> create(@RequestBody ProductCreateDto productCreateDto){
        ApiResponse response = productService.create(productCreateDto);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }

    @GetMapping("/recent")
    public ResponseEntity<List<ProductRecentDto>> getRecent(){
        List<ProductRecentDto> productRecentDtoList = productService.getRecentProducts();
        return new ResponseEntity<>(productRecentDtoList, HttpStatus.OK);
    }


}
