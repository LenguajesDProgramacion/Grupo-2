/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato.vistas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Marvinero
 */
@Entity
@Table(name = "arbitro", catalog = "Campeonato", schema = "")
@NamedQueries({
    @NamedQuery(name = "Arbitro.findAll", query = "SELECT a FROM Arbitro a")
    , @NamedQuery(name = "Arbitro.findByIdArbitro", query = "SELECT a FROM Arbitro a WHERE a.idArbitro = :idArbitro")
    , @NamedQuery(name = "Arbitro.findByNombre", query = "SELECT a FROM Arbitro a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Arbitro.findByApellidoPaterno", query = "SELECT a FROM Arbitro a WHERE a.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Arbitro.findByApellidoMaterno", query = "SELECT a FROM Arbitro a WHERE a.apellidoMaterno = :apellidoMaterno")})
public class Arbitro implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_arbitro")
    private Integer idArbitro;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    public Arbitro() {
    }

    public Arbitro(Integer idArbitro) {
        this.idArbitro = idArbitro;
    }

    public Arbitro(Integer idArbitro, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.idArbitro = idArbitro;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getIdArbitro() {
        return idArbitro;
    }

    public void setIdArbitro(Integer idArbitro) {
        Integer oldIdArbitro = this.idArbitro;
        this.idArbitro = idArbitro;
        changeSupport.firePropertyChange("idArbitro", oldIdArbitro, idArbitro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        String oldApellidoPaterno = this.apellidoPaterno;
        this.apellidoPaterno = apellidoPaterno;
        changeSupport.firePropertyChange("apellidoPaterno", oldApellidoPaterno, apellidoPaterno);
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        String oldApellidoMaterno = this.apellidoMaterno;
        this.apellidoMaterno = apellidoMaterno;
        changeSupport.firePropertyChange("apellidoMaterno", oldApellidoMaterno, apellidoMaterno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArbitro != null ? idArbitro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arbitro)) {
            return false;
        }
        Arbitro other = (Arbitro) object;
        if ((this.idArbitro == null && other.idArbitro != null) || (this.idArbitro != null && !this.idArbitro.equals(other.idArbitro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "campeonato.vistas.Arbitro[ idArbitro=" + idArbitro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
