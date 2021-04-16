package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Book;
import com.tatchik.catalog.entity.Incoming;

import java.util.List;
import java.util.Objects;
import java.util.Set;


public class BookDto extends Book {
    private Integer id;
    private String name;
    private Set<IncomingDto> incomingDto;
    private List<OrdersDto> ordersDto;

    public BookDto() {
    }

    public BookDto(Integer id, String name, Set<IncomingDto> incomingDto, List<OrdersDto> ordersDto) {
        this.id = id;
        this.name = name;
        this.incomingDto = incomingDto;
        this.ordersDto = ordersDto;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Set<IncomingDto> getIncomingDto() {
        return incomingDto;
    }

    public void setIncomingDto(Set<IncomingDto> incomingDto) {
        this.incomingDto = incomingDto;
    }

    public List<OrdersDto> getOrdersDto() {
        return ordersDto;
    }

    public void setOrdersDto(List<OrdersDto> ordersDto) {
        this.ordersDto = ordersDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookDto)) return false;
        if (!super.equals(o)) return false;

        BookDto bookDto = (BookDto) o;

        if (getId() != null ? !getId().equals(bookDto.getId()) : bookDto.getId() != null) return false;
        if (getName() != null ? !getName().equals(bookDto.getName()) : bookDto.getName() != null) return false;
        if (getIncomingDto() != null ? !getIncomingDto().equals(bookDto.getIncomingDto()) : bookDto.getIncomingDto() != null)
            return false;
        return getOrdersDto() != null ? getOrdersDto().equals(bookDto.getOrdersDto()) : bookDto.getOrdersDto() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getIncomingDto() != null ? getIncomingDto().hashCode() : 0);
        result = 31 * result + (getOrdersDto() != null ? getOrdersDto().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", incomingDto=" + incomingDto +
                ", ordersDto=" + ordersDto +
                '}';
    }
}
