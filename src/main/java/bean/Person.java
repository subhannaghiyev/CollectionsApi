package bean;

import java.util.Objects;

public abstract class Person {

    private int id;
    private String name;
    private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "id=" + id + ", name=" + name + ", surname=" + surname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.surname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
    /*
    Bizde ilk novbede hec birini Override etmeden bele sual yarana biler biz niye equals metodunu Override etmeiyik ?
    Cunki bizim verdiyimiz Class - larin Obyektleri reference olaraq beraber olmaya biler lakin belke o Parametr(value)
    olaraq bir-birine beraberdir. Biz buna gorede equals metdounu Override etmeliyik sonra equals metodunu Override etdik
    sonra ne etmeliyik hashCode Override etmeliyik eger equals metdoumuzda verdiyimiz parametrler bearberdirse hashCode
    override olunmalidir ki, hashCode 1 defe caph olsunsun. Eks Halda o o 2 defe capha verilecek burada ise biz Convention
    i pozmus oluruqqq....
    Bizim hashCode ile equals metodunu Override etmeyimiz convention deyil ama Override etdikden sora nece etmeyimiz
    Convention dir.. (Convention - konvensiya yeni ki bir-birile duzgun anlasmagidir.)
     */


}
