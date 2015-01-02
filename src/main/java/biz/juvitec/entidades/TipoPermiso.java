package biz.juvitec.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_permiso")
public class TipoPermiso implements Serializable {

    @Column(nullable=false)
    @Basic
    private String nombre;
    @Id
    private String codigo;
    @Basic
    private int diasMaximo;
    @Column(nullable=false)
    @Basic
    private char clase;
    @Column(name="tipo_descuento",nullable=false)
    @Basic
    private char tipoDescuento;
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Permiso.class,mappedBy = "tipoPermiso")
    private List<Permiso> licenciaList;

    public TipoPermiso() {

    }
   
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
    public int getDiasMaximo() {
        return this.diasMaximo;
    }

    public void setDiasMaximo(int diasMaximo) {
        this.diasMaximo = diasMaximo;
    }
   
    public char getClase() {
        return this.clase;
    }

    public void setClase(char clase) {
        this.clase = clase;
    }
   
    public char getTipoDescuento() {
        return this.tipoDescuento;
    }

    public void setTipoDescuento(char tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
   
    public List<Permiso> getLicenciaList() {
        return this.licenciaList;
    }

    public void setLicenciaList(List<Permiso> licenciaList) {
        this.licenciaList = licenciaList;
    }
}
