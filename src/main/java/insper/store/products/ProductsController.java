package insper.store.products;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "store-product")
public interface ProductsController {
    
    @PostMapping("/products")
    public ResponseEntity<ProductOut> create(
        @RequestBody(required = true) ProductIn in
    );

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) ProductIn in
    );

    @GetMapping("/products")
    public ResponseEntity<List<ProductOut>> read();

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductOut> read(
        @PathVariable(required = true) String id
    );

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> delete(
        @PathVariable(required = true) String id
    );
}
