package empresa;

public class Herramienta 
{
    protected String nombre;
    protected String marca;
    protected int codigo;
    protected String modelo;
    protected Estado estado;

   public Herramienta()
   {
   }
   public String getNombre()
   {
      return nombre;
   } 
   public String getMarca()
   {
       return marca;
   }
   public int getcodigo()
   {
       return codigo;
   }
   public String getModelo()
   {
      return modelo;
   }
   public Estado getEstado()
   {
      return estado;
   }
   public String setNombre( String _nombre)
   {
      this.nombre= _nombre;
   }
   public Estado setEstado(Estado _estado)
   {
      this estado = _estado;
   }
   public String setMarca (String _marca)
   {
      this.marca= _marca;
   }
   public int setCodigo(int _codigo)
   {
      this.codigo = _codigo;
   }
   public String setModelo(String _modeo)
   {
      this.modelo = _modelo;
   }
}
