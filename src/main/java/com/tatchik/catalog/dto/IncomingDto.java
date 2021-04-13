package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Incoming;
import com.tatchik.catalog.entity.Suppliers;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Set;

public class IncomingDto extends Incoming {

    private Integer id;
    private Integer count_Incom;
    private DecimalFormat price;
    private Set<SuppliersDto> suppliersDto;


    public IncomingDto() {
    }

    public IncomingDto(Integer id, Integer count_Incom, DecimalFormat price, Set<SuppliersDto> suppliersDto) {
        this.id = id;
        this.count_Incom = count_Incom;
        this.price = price;
        this.suppliersDto = suppliersDto;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getCount_Incom() {
        return count_Incom;
    }

    @Override
    public void setCount_Incom(Integer count_Incom) {
        this.count_Incom = count_Incom;
    }

    @Override
    public DecimalFormat getPrice() {
        return price;
    }

    @Override
    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public Set<SuppliersDto> getSuppliersDto() {
        return suppliersDto;
    }

    public void setSuppliersDto(Set<SuppliersDto> suppliersDto) {
        this.suppliersDto = suppliersDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncomingDto)) return false;
        if (!super.equals(o)) return false;
        IncomingDto that = (IncomingDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getCount_Incom(), that.getCount_Incom()) && Objects.equals(getPrice(), that.getPrice()) && Objects.equals(getSuppliersDto(), that.getSuppliersDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getCount_Incom(), getPrice(), getSuppliersDto());
    }

    @Override
    public String toString() {
        return "IncomingDto{" +
                "id=" + id +
                ", count_Incom=" + count_Incom +
                ", price=" + price +
                ", suppliersDto=" + suppliersDto +
                '}';
    }
}
