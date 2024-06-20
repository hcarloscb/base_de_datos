package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String p_surname;
    private String m_surname;
    
    
    public Long getId () {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getPSurname() {
        return p_surname;
    }

    public void setPSurname(String p_surname) {
        this.p_surname = p_surname;
    }

    @ColumnName("apellido_materno")
    public String getMSurname() {
        return m_surname;
    }

    public void setMSurname(String m_surname) {
        this.m_surname = m_surname;
    }

    @ColumnName("rfc") 
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    private String rfc;
}