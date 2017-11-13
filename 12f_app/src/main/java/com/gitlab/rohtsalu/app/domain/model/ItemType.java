package com.gitlab.rohtsalu.app.domain.model;

/**
 * Created by Gunnar Rohtsalu, Finestmedia, gunnar.rohtsalu@finestmedia.ee
 */
public enum ItemType {

    UNKNOWN(1L),
    ELECTRONICS(2L),
    CD(3L);

    Long id;

    ItemType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
