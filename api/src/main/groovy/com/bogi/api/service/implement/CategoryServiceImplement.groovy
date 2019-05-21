package com.bogi.api.service.implement
import com.bogi.api.entity.Category 
import com.bogi.api.repository.CategoryRepository 
import com.bogi.api.service.CategoryService 
import org.springframework.beans.factory.annotation.Autowired 
import org.springframework.stereotype.Service

@Service 
class CategoryServiceimplement implements CategoryService {
 @Autowired    
 private final CategoryRepository CategoryRepository     
 @Override    
 List<Category>findAll() { 
 CategoryRepository.findAll()           
 }
 @Override    
  Category findById(int id) { 
  CategoryRepository.findById(id)
   }
 }