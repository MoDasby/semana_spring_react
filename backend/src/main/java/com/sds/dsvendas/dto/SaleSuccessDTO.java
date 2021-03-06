package com.sds.dsvendas.dto;

import java.io.Serializable;

import com.sds.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}

