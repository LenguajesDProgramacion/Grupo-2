/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato.vistas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laboratorio2Pc8
 */
@Entity
@Table(name = "jugadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugadores.findAll", query = "SELECT j FROM Jugadores j")
    , @NamedQuery(name = "Jugadores.findByIdJugador", query = "SELECT j FROM Jugadores j WHERE j.idJugador = :idJugador")
    , @NamedQuery(name = "Jugadores.findByNombre", query = "SELECT j FROM Jugadores j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jugadores.findByApellidoPaterno", query = "SELECT j FROM Jugadores j WHERE j.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Jugadores.findByApellidoMaterno", query = "SELECT j FROM Jugadores j WHERE j.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Jugadores.findByNumerocamiseta", query = "SELECT j FROM Jugadores j WHERE j.numerocamiseta = :numerocamiseta")})
public class Jugadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_jugador")
    private String idJugador;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido_Paterno")
    private String apellidoPaterno;
    @Column(name = "Apellido_Materno")
    private String apellidoMaterno;
    @Column(name = "Numero_camiseta")
    private String numerocamiseta;
    @JoinColumn(name = "cod_equipo", referencedColumnName = "id_equipo")
    @ManyToOne
    private Equipo codEquipo;

    public Jugadores() {
    }

    public Jugadores(String idJugador) {
        this.idJugador = idJugador;
    }

    Jugadores(String text, String text0, String text1, String text2, Equipo seleccionado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumerocamiseta() {
        return numerocamiseta;
    }

    public void setNumerocamiseta(String numerocamiseta) {
        this.numerocamiseta = numerocamiseta;
    }

    public Equipo getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(Equipo codEquipo) {
        this.codEquipo = codEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugador != null ? idJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugadores)) {
            return false;
        }
        Jugadores other = (Jugadores) object;
        if ((this.idJugador == null && other.idJugador != null) || (this.idJugador != null && !this.idJugador.equals(other.idJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "campeonato.vistas.Jugadores[ idJugador=" + idJugador + " ]";
    }
    
}
