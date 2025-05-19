package az.edu.itbrains.ecommerce.dtos.category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryNavbarDto {
    private Long id;
    private String name;
    private boolean navbar;
}
