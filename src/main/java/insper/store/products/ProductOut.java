package insper.store.products;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ProductOut (
    String id,
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
    String price
) {
    
}
