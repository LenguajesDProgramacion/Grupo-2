/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato.vistas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Marvinero
 */
@Entity
@Table(name = "equipo", catalog = "Campeonato", schema = "")
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByIdEquipo", query = "SELECT e FROM Equipo e WHERE e.idEquipo = :idEquipo")
    , @NamedQuery(name = "Equipo.findByNombreequipo", query = "SELECT e FROM Equipo e WHERE e.nombreequipo = :nombreequipo")})
public class Equipo implements Serializable {

    @OneToMany(mappedBy = "codEquipo")
    private Collection<Jugadores> jugadoresCollection;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private String idEquipo;
    @Column(name = "Nombre_equipo")
    private String nombreequipo;

    public Equipo() {
    }

    public Equipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        String oldIdEquipo = this.idEquipo;
        this.idEquipo = idEquipo;
        changeSupport.firePropertyChange("idEquipo", oldIdEquipo, idEquipo);
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        String oldNombreequipo = this.nombreequipo;
        this.nombreequipo = nombreequipo;
        changeSupport.firePropertyChange("nombreequipo", oldNombreequipo, nombreequipo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "campeonato.vistas.Equipo[ idEquipo=" + idEquipo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    @XmlTransient
    public Collection<Jugadores> getJugadoresCollection() {
        return jugadoresCollection;
    }

    public void setJugadoresCollection(Collection<Jugadores> jugadoresCollection) {
        this.jugadoresCollection = jugadoresCollection;
    }
    
}
