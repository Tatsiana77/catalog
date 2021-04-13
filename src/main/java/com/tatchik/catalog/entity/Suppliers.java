package com.tatchik.catalog.entity;

import com.tatchik.catalog.dto.IncomingDto;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="suppliers_Name")
    private String suppliers_Name;

    @Column(name="suppliers_Phone")
    private String suppliers_Phone;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "suppliers_incoming",
            joinColumns = @JoinColumn(name = "suppliers_id"),
            inverseJoinColumns = @JoinColumn(name = "incoming_id"))
    private Set<Incoming> incoming;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliers_Name() {
        return suppliers_Name;
    }

    public void setSuppliers_Name(String suppliers_Name) {
        this.suppliers_Name = suppliers_Name;
    }

    public String getSuppliers_Phone() {
        return suppliers_Phone;
    }

    public void setSuppliers_Phone(String suppliers_Phone) {
        this.suppliers_Phone = suppliers_Phone;
    }

    public Set<Incoming> getIncoming() {
        return incoming;
    }

    public void setIncoming(Set<Incoming> incoming) {
        this.incoming = incoming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suppliers)) return false;

        Suppliers suppliers = (Suppliers) o;

        if (getId() != null ? !getId().equals(suppliers.getId()) : suppliers.getId() != null) return false;
        if (getSuppliers_Name() != null ? !getSuppliers_Name().equals(suppliers.getSuppliers_Name()) : suppliers.getSuppliers_Name() != null)
            return false;
        if (getSuppliers_Phone() != null ? !getSuppliers_Phone().equals(suppliers.getSuppliers_Phone()) : suppliers.getSuppliers_Phone() != null)
            return false;
        if (getIncoming() != null ? !getIncoming().equals(suppliers.getIncoming()) : suppliers.getIncoming() != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getSuppliers_Name() != null ? getSuppliers_Name().hashCode() : 0);
        result = 31 * result + (getSuppliers_Phone() != null ? getSuppliers_Phone().hashCode() : 0);
        result = 31 * result + (getIncoming() != null ? getIncoming().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "id=" + id +
                ", suppliers_Name='" + suppliers_Name + '\'' +
                ", suppliers_Phone='" + suppliers_Phone + '\'' +
                ", incoming=" + incoming +
                '}';
    }
}





