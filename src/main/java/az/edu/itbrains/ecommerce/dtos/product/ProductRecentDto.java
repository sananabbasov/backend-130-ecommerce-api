package az.edu.itbrains.ecommerce.dtos.product;

import az.edu.itbrains.ecommerce.dtos.category.CategoryProductDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRecentDto {
    private Long id;
    private String name;
    private Double price;
    private Double discountPrice;
    private int review;
    private int reviewCount;
    private String photoUrl;
    private CategoryProductDto category;
}
