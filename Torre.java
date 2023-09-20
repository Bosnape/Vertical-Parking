public class Torre {
    private int cantidad_p = 12;
    private int[] parq = new int[cantidad_p];
    private String lugar = "None";
    private String nombre;

    public Torre(String nombre, int cantidad_p, String lugar){
        set_nombre(nombre);
        set_t_parqueaderos(cantidad_p);
        set_lugar(lugar);
    }

    public String get_lugar(){
        return lugar;
    }
    void set_lugar(String l){
        this.lugar = l;
    }

    public int get_t_parqueaderos(){
        return cantidad_p;
    }
    public void set_t_parqueaderos(int p){
        this.cantidad_p = p;
    }

    public String get_nombre(){
        return nombre;
    }
    public void set_nombre(String n){
        this.nombre = n;
    }

    public boolean libre(){
        int espacios_l = 0;
        for (int espacio = 0; espacio < parq.length; espacio++){
            if (parq[espacio] == 0){
                espacios_l += 1;
            }
        }
        return espacios_l > 0;
    }
    public void actualizar(int n){
        if (n == 1){
            for (int espacio = 0; espacio < parq.length; espacio++){
                if (parq[espacio] == 0){
                    parq[espacio] = 1;
                }
            }
        } else if (n == 0){
            for (int espacio = 0; espacio < parq.length; espacio++){
                if (parq[espacio] == 1){
                    parq[espacio] = 0;
                }
            }
        } else {
            System.out.println("Opciones: 0 | 1");
        }
    }
}
