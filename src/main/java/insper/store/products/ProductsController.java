package insper.store.products;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-products")
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
    public ResponseEntity<ProductOut> read(
        @RequestHeader(required = true, name = "id-user") String idUser,
        @RequestHeader(required = true, name = "role-user") String roleUser
    );

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductOut> readById(
        @PathVariable(required = true) String id,
        @RequestHeader(required = true, name = "id-user") String idUser,
        @RequestHeader(required = true, name = "role-user") String roleUser
    );
}
