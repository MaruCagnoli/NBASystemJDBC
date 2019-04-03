import java.util.Date;
import java.util.Objects;

public class Equipo {

    private int idEquipo;
    private String nombreEquipo;
   // private Date fundacion;
    private int antiguedad;

    public Equipo(){

    }

    public Equipo(int idEquipo, String nombreEquipo, int antiguedad) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        //this.fundacion = fundacion;
        this.antiguedad = antiguedad;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }



    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", nombreEquipo='" + nombreEquipo + '\'' +

                ", antiguedad=" + antiguedad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return idEquipo == equipo.idEquipo &&
                antiguedad == equipo.antiguedad &&
                Objects.equals(nombreEquipo, equipo.nombreEquipo);

    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipo, nombreEquipo, antiguedad);
    }
}
