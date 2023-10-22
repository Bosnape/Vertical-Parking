public class Billetera {
    private int saldo;
    private int id;

    public Billetera(int id, int saldo){
        this.saldo = saldo;
        this.id = id;
    }

    // Mostrar la billetera como un string
    public String to_string(){
        return "Saldo: " + saldo;
    }

    public int get_saldo(){
        return saldo;
    }
    public void set_saldo(int saldo){
        this.saldo = saldo;
    }

    public int get_id(){
        return id;
    }

    public void retirar(int n){
        saldo -= n;
    }
    public void depositar(int n){
        saldo += n;
    }
}
