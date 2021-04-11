package com.tatchik.catalog.dto;

import com.tatchik.catalog.entity.Incoming;
import com.tatchik.catalog.entity.Suppliers;

import java.util.Set;

public class SuppliersDto extends Suppliers {
    private Integer id;
    private String suppliers_Name;
    private String suppliers_Phone;
    private Set<IncomingDto> incomingDto;

    public SuppliersDto() {
    }

    public SuppliersDto(Integer id, String suppliers_Name, String suppliers_Phone, Set<IncomingDto> incomingDto) {
        this.id = id;
        this.suppliers_Name = suppliers_Name;
        this.suppliers_Phone = suppliers_Phone;
        this.incomingDto = incomingDto;
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
    public String getSuppliers_Name() {
        return suppliers_Name;
    }

    @Override
    public void setSuppliers_Name(String suppliers_Name) {
        this.suppliers_Name = suppliers_Name;
    }

    @Override
    public String getSuppliers_Phone() {
        return suppliers_Phone;
    }

    @Override
    public void setSuppliers_Phone(String suppliers_Phone) {
        this.suppliers_Phone = suppliers_Phone;
    }

    public Set<IncomingDto> getIncomingDto() {
        return incomingDto;
    }

    public void setIncomingDto(Set<IncomingDto> incomingDto) {
        this.incomingDto = incomingDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuppliersDto)) return false;
        if (!super.equals(o)) return false;

        SuppliersDto that = (SuppliersDto) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getSuppliers_Name() != null ? !getSuppliers_Name().equals(that.getSuppliers_Name()) : that.getSuppliers_Name() != null)
            return false;
        if (getSuppliers_Phone() != null ? !getSuppliers_Phone().equals(that.getSuppliers_Phone()) : that.getSuppliers_Phone() != null)
            return false;
        return getIncomingDto() != null ? getIncomingDto().equals(that.getIncomingDto()) : that.getIncomingDto() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getSuppliers_Name() != null ? getSuppliers_Name().hashCode() : 0);
        result = 31 * result + (getSuppliers_Phone() != null ? getSuppliers_Phone().hashCode() : 0);
        result = 31 * result + (getIncomingDto() != null ? getIncomingDto().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SuppliersDto{" +
                "id=" + id +
                ", suppliers_Name='" + suppliers_Name + '\'' +
                ", suppliers_Phone='" + suppliers_Phone + '\'' +
                ", incomingDto=" + incomingDto +
                '}';
    }
}
