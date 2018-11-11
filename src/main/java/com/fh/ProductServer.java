package com.fh;

import com.fh.shop.Product;
import com.fh.shop.ServerResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name="product-api-provider")
public interface ProductServer {

    @GetMapping(value = "/products")
    public   ServerResponse getList();

    @PostMapping(value = "/products",consumes = "application/json")
    ServerResponse add(@RequestBody Product product);

    @DeleteMapping("/products/{id}")
    ServerResponse delete(@PathVariable("id") String ids );

    @PutMapping("/products")
    ServerResponse update(@RequestBody Product product);

    @GetMapping("/products1")
    ServerResponse get2(@RequestParam("id") Integer id);
}
