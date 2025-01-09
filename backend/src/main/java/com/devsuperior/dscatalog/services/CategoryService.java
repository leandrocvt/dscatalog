package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.lib.dto.CategoryDTO;
import com.devsuperior.dscatalog.lib.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        List<Category> result = repository.findAll();
        return result.stream().map(CategoryDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id){
        Category category = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Entity not found!"));
        return new CategoryDTO(category);
    }

}
