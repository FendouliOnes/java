import java.util.Objects;

public class departement {
     int id;
     String nomDepartement;
     int nbrEmploye;

    public departement() {
    }

    public departement(int id, String nomDepartement, int nbrEmploye) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmploye = nbrEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof departement that)) return false;
        return id == that.id && Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmploye=" + nbrEmploye +
                '}';
    }
}

