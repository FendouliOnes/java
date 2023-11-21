import java.util.TreeSet;
import java.util.HashSet;

public class DepartementHashSet<T> implements IDepartement<T>{
    HashSet<String> departements = new HashSet<>();
    @Override
    public void ajouterDepartement(T t) {

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(T t) {
        return false;
    }

    @Override
    public void supprimerDepartement(T t) {

    }

    @Override
    public void displayDepartement() {

    }

    @Override
    public TreeSet<T> trierDepartementById() {
        return null;
    }
}
