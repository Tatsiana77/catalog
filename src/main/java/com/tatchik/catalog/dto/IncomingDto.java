package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Incoming;
import com.tatchik.catalog.entity.Suppliers;

import java.text.DecimalFormat;
import java.util.Set;

public class IncomingDto extends Incoming {

    private Integer id;
    private Integer count_Incom;
    private DecimalFormat price;
    private Set<SuppliersDto> suppliersDto;
    private Set<BookDto> bookDto;

    public IncomingDto() {
    }

    public IncomingDto(Integer id, Integer count_Incom, DecimalFormat price,
                       Set<SuppliersDto> suppliersDto, Set<BookDto> bookDto) {
        this.id = id;
        this.count_Incom = count_Incom;
        this.price = price;
        this.suppliersDto = suppliersDto;
        this.bookDto = bookDto;
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

    public Set<BookDto> getBookDto() {
        return bookDto;
    }

    public void setBookDto(Set<BookDto> bookDto) {
        this.bookDto = bookDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncomingDto)) return false;
        if (!super.equals(o)) return false;

        IncomingDto that = (IncomingDto) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getCount_Incom() != null ? !getCount_Incom().equals(that.getCount_Incom()) : that.getCount_Incom() != null)
            return false;
        if (getPrice() != null ? !getPrice().equals(that.getPrice()) : that.getPrice() != null) return false;
        if (getSuppliersDto() != null ? !getSuppliersDto().equals(that.getSuppliersDto()) : that.getSuppliersDto() != null)
            return false;
        return getBookDto() != null ? getBookDto().equals(that.getBookDto()) : that.getBookDto() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getCount_Incom() != null ? getCount_Incom().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getSuppliersDto() != null ? getSuppliersDto().hashCode() : 0);
        result = 31 * result + (getBookDto() != null ? getBookDto().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IncomingDto{" +
                "id=" + id +
                ", count_Incom=" + count_Incom +
                ", price=" + price +
                ", suppliersDto=" + suppliersDto +
                ", bookDto=" + bookDto +
                '}';
    }
}
