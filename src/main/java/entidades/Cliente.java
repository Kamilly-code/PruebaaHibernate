package entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENTEID", nullable = false)
    private Long clienteId;

    @Column(name = "CEDULA_RUC", nullable = false)
    private String cedulaRuc;

    @Column(name = "NOMBRECIA", nullable = false)
    private String nombrecia;

    @Column(name = "NOMBRECONTACTO", nullable = false)
    private String nombrecontacto;

    @Column(name = "DIRECCIONCLI", nullable = false)
    private String direccioncli;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "FIJO")
    private String fijo;

    @Column(name = "VERSION")
    private Integer version;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordene> ordenes;

    // Getters and setters


    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getCedulaRuc() {
        return cedulaRuc;
    }

    public void setCedulaRuc(String cedulaRuc) {
        this.cedulaRuc = cedulaRuc;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getNombrecia() {
        return nombrecia;
    }

    public void setNombrecia(String nombrecia) {
        this.nombrecia = nombrecia;
    }

    public String getDireccioncli() {
        return direccioncli;
    }

    public void setDireccioncli(String direccioncli) {
        this.direccioncli = direccioncli;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<Ordene> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Ordene> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId=" + clienteId +
                ", cedulaRuc='" + cedulaRuc + '\'' +
                ", nombrecia='" + nombrecia + '\'' +
                ", nombrecontacto='" + nombrecontacto + '\'' +
                ", direccioncli='" + direccioncli + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", fijo='" + fijo + '\'' +
                ", version=" + version +
                '}';
    }
}
