package com.hozyain.core.repositories.specifications;

import com.hozyain.core.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {
    public static Specification<Product> priceGreaterThanOrEqualTo(Integer price) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), price));
    }

    public static Specification<Product> priceLowerThanOrEqualTo(Integer price) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), price));
    }
}
