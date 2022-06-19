package com.spring.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category extends  CategoryOrder{

    @OneToMany(mappedBy = "category")
    private Set<Order> orrders;

}
