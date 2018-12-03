/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

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
 * @author Laboratorio2Pc8
 */
@Entity
@Table(name = "alineacion", catalog = "CampeonatoCompetencia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Alineacion.findAll", query = "SELECT a FROM Alineacion a")
    , @NamedQuery(name = "Alineacion.findByIdAlineacion", query = "SELECT a FROM Alineacion a WHERE a.idAlineacion = :idAlineacion")
    , @NamedQuery(name = "Alineacion.findByIdPartido", query = "SELECT a FROM Alineacion a WHERE a.idPartido = :idPartido")
    , @NamedQuery(name = "Alineacion.findByIdEquipo", query = "SELECT a FROM Alineacion a WHERE a.idEquipo = :idEquipo")
    , @NamedQuery(name = "Alineacion.findByIdJugador", query = "SELECT a FROM Alineacion a WHERE a.idJugador = :idJugador")
    , @NamedQuery(name = "Alineacion.findByGoles", query = "SELECT a FROM Alineacion a WHERE a.goles = :goles")})
public class Alineacion implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alineacion")
    private Integer idAlineacion;
    @Basic(optional = false)
    @Column(name = "id_partido")
    private int idPartido;
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private int idEquipo;
    @Basic(optional = false)
    @Column(name = "id_jugador")
    private int idJugador;
    @Basic(optional = false)
    @Column(name = "goles")
    private int goles;

    public Alineacion() {
    }

    public Alineacion(Integer idAlineacion) {
        this.idAlineacion = idAlineacion;
    }

    public Alineacion(Integer idAlineacion, int idPartido, int idEquipo, int idJugador, int goles) {
        this.idAlineacion = idAlineacion;
        this.idPartido = idPartido;
        this.idEquipo = idEquipo;
        this.idJugador = idJugador;
        this.goles = goles;
    }

    public Integer getIdAlineacion() {
        return idAlineacion;
    }

    public void setIdAlineacion(Integer idAlineacion) {
        Integer oldIdAlineacion = this.idAlineacion;
        this.idAlineacion = idAlineacion;
        changeSupport.firePropertyChange("idAlineacion", oldIdAlineacion, idAlineacion);
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        int oldIdPartido = this.idPartido;
        this.idPartido = idPartido;
        changeSupport.firePropertyChange("idPartido", oldIdPartido, idPartido);
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        int oldIdEquipo = this.idEquipo;
        this.idEquipo = idEquipo;
        changeSupport.firePropertyChange("idEquipo", oldIdEquipo, idEquipo);
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        int oldIdJugador = this.idJugador;
        this.idJugador = idJugador;
        changeSupport.firePropertyChange("idJugador", oldIdJugador, idJugador);
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        int oldGoles = this.goles;
        this.goles = goles;
        changeSupport.firePropertyChange("goles", oldGoles, goles);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlineacion != null ? idAlineacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alineacion)) {
            return false;
        }
        Alineacion other = (Alineacion) object;
        if ((this.idAlineacion == null && other.idAlineacion != null) || (this.idAlineacion != null && !this.idAlineacion.equals(other.idAlineacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "campeonato.Alineacion[ idAlineacion=" + idAlineacion + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
