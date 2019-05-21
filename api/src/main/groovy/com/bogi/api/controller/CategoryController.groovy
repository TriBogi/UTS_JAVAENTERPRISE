package com.teguh.api.controller 
import com.teguh.api.entity.Category
import com.teguh.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController

@RequestMapping('/categories')
class CategoryController {    
 @Autowired    
private final CategoryService CategoryService
@GetMapping('')    
    List<Category> findAll() {        
    CategoryService.findAll()   
  }
  }