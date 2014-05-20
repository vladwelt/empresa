package empresa;
public enum Estado{
    USO(0), MANTENIMIENTO(1), BAJA(2);
    private int numero;
    Estado(int _numero){
        numero = _numero;
    }
}
