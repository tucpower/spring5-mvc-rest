package com.jrt.spring5mvcrest.api.mapper;

import com.jrt.spring5mvcrest.api.model.CategoryDTO;
import com.jrt.spring5mvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    //@Mapping(source = "id", target = "id")
    CategoryDTO categoryToCategoryDTO(Category category);
}
