package com.spring.restaurant.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category extends  CategoryOrder{

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Order> orders;

}
