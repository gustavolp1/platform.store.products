package insper.store.products;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ProductIn (
    String name,
    String description,
    String category,
    String brand,
    String model,
    String color,
    String size,
    String weight,
    String dimension,
    String material,
    Double price,
    Integer quantity
) {
    
}

