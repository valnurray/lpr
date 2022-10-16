package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.ProductMembers;
import com.lankin.lpr.repository.ProductMembersRepository;
import com.lankin.lpr.service.ProductMembersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMembersServiceImpl implements ProductMembersService {

    private ProductMembersRepository productMembersRepository;

    public ProductMembersServiceImpl (ProductMembersRepository productMembersRepository) {
        this.productMembersRepository = productMembersRepository;
    }

    @Override
    public ProductMembers addProductMembers(ProductMembers productMembers) {
        return productMembersRepository.save(productMembers);
    }

    @Override
    public List<ProductMembers> getAllProductMembers() {
        return productMembersRepository.findAll();
    }

    @Override
    public ProductMembers getProductMembersById(long id) {
        return productMembersRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("ProductMember", "Id", id));
    }

    @Override
    public ProductMembers updateProductMembers(ProductMembers productMembers, long id) {
        ProductMembers existingProductMember = productMembersRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("ProductMember", "Id", id));

        existingProductMember.setOrderTime(productMembers.getOrderTime());
        productMembersRepository.save(existingProductMember);
        return existingProductMember;
    }

    @Override
    public void deleteProductMembers(long id) {
        productMembersRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("ProductMember", "Id", id));
        productMembersRepository.deleteById(id);
    }
}
