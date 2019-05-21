package com.teguh.api.service
import com.teguh.api.entity.Category

interface CategoryService { 
    List<Category>findAll()   
    Category findById(int id)
     }