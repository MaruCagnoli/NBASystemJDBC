import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


            List<Equipo> equiposNba = new ArrayList<>();
            daoEquipo daoNbaTeams = new daoEquipo();

            equiposNba = daoNbaTeams.listar();
            Equipo e;
            Iterator iter = equiposNba.iterator();
            while(iter.hasNext()){
                e = (Equipo) iter.next();
                System.out.println(e.toString());
            }







    }

}
