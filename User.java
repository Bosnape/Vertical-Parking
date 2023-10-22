public class User {
    private int id;
    private String placa;
    private String nombre;

    // Constructor de un usuario existente
    public User(int id, String nombre, String placa){
        this.id = id;
        this.placa = placa;
        this.nombre = nombre;
    }

    // Mostrar el usuario como un string
    public String to_string(){
        return "Nombre: " + nombre + " || Placa: " + placa;
    }

    // Acceder o manipular el atributo id
    public int get_id(){
        return id;
    }
    public void set_id(int id){
        this.id = id;
    }

    // Acceder o manipular el atributo placa
    public String get_placa(){
        return placa;
    }
    public void set_placa(String placa){
        this.placa = placa;
    }

    // Acceder o manipular el atributo nombre
    public String get_nombre(){
        if (nombre.indexOf(' ') != -1){
            String[] f_name = nombre.split(" ");
            return f_name[0];
        } else {
            return nombre;
        }
    }
    public void set_nombre(String nombre){
        this.nombre = nombre;
    }
    public String get_nombre_completo(){
        return nombre;
    }

    // Borrar los datos del usuario
    public void borrar() {
        this.id = -1;
        this.placa = "";
        this.nombre = "";
    }
}
