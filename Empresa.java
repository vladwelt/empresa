package empresa;
puclic class Empresa{
    private Empleado empleados [] ;
    private String nombre;
    private Fecha fechaFundacion;

    public empresa()
    {
    

    }
    public String  getNombre()
    {
     return nombre;
    }
    public void  setNombre(String _nombre)
    {
     this.nombre = _nombre;
    }
    public Fecha getFechaFundacion()
    {
        return fechaFundacion;
    }
    public void setFechaFundacion(Fecha _fechaFundacion)
    {
        this.fechaFundacion = _fechaFundacion;
        
    }


}
