package com.lankin.lpr.service;

import com.lankin.lpr.model.Product;
import com.lankin.lpr.model.ProductMembers;

import java.util.List;

public interface ProductMembersService {
    ProductMembers addProductMembers(ProductMembers productMembers);
    List<ProductMembers> getAllProductMembers();
    ProductMembers getProductMembersById(long id);
    ProductMembers updateProductMembers(ProductMembers productMembers, long id);
    void deleteProductMembers(long id);
}
