package insper.store.products;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ProductIn (
    String id_partner,
    String name,
    String description,
    Double price,
    Integer quantity
) {
    
}

