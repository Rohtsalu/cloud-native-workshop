package com.gitlab.rohtsalu.app;

import com.gitlab.rohtsalu.app.domain.model.ItemType;
import com.gitlab.rohtsalu.app.domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Gunnar Rohtsalu, Finestmedia, gunnar.rohtsalu@finestmedia.ee
 */
public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
    
}

