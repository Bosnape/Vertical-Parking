public class Torre {
    private int[] parq = new int[12];
    private String lugar;
    private String nombre;

    // Constructor
    public Torre(String nombre, String lugar){
        this.nombre = nombre;
        this.lugar = lugar;
    }

    // Acceder o manipular el atributo lugar
    public String get_lugar(){
        return lugar;
    }
    void set_lugar(String l){
        this.lugar = l;
    }

    // Acceder o manipular el atributo nombre
    public String get_nombre(){
        return nombre;
    }
    public void set_nombre(String n){
        this.nombre = n;
    }

    // Acceder al atributo cantidad de parqueaderos
    public int cantidad_parqueaderos() {
        return parq.length;
    }

    // Revisar si hay parqueaderos libres
    public boolean libre(){
        for (int espacio = 0; espacio < parq.length; espacio++){
            if (parq[espacio] == 0){
                return true;
            }
        }
        return false;
    }

    // Ocupar un parqueadero
    public void ocupar(){
        for (int espacio = 0; espacio < parq.length; espacio++){
            if (parq[espacio] == 0){
                parq[espacio] = 1;
                break;
            }
        }
    }

    public int parq_libres(){
        int libres = 0;
        for (int espacio = 0; espacio < parq.length; espacio++){
            if (parq[espacio] == 0){
                libres++;
            }
        }
        return libres;
    }
}
