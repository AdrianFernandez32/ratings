package cetys.edu.bathrat.DAO.entidades;

import org.hibernate.annotations.DialectOverride.GeneratedColumn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restroom", schema = "public")
public class restroomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restroom_id")
    private int bathroomId;

    @Column(name = "ubicacion")
    private String ubicacion;

    // Getter para rest_roomId
    public int getRestroomId() {
        return bathroomId;
    }

    // Setter para rest_roomId
    public void setRestroomId(int bathroomId) {
        this.bathroomId = bathroomId;
    }

    // Getter para ubicacion
    public String getUbicacion() {
        return ubicacion;
    }

    // Setter para ubicacion
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
