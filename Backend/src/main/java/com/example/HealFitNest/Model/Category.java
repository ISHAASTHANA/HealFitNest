package com.example.HealFitNest.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Category")

public class Category {

    @Id
    private int categoryId;
    private List<String> subCategoryId;
    private String categoryName;
    private List<String> subCategoryName;
    private String categoryImage;

}
