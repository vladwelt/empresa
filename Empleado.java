package empresa;

public class Empleado
{
    private String nombre; 
    private String apellido;
    private Fecha nacimiento;
    private String profecion;
    private int salario;
    private Herramienta herramientas;

    public Empleado() 
    {
    
    }

    public void setNombre(String _nombre)
    {
        this.nombre = _nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Fecha getNacimiento()
    {
        return nacimiento;
    }

    public void setNacimiento(Fecha _nacimiento)
    {
        this.nacimiento = _nacimiento;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String _apellido) 
    {
        this.apellido = _apellido;
    }

    public String getProfecion()
    {
        return profecion;
    }

    public void setProfecion(String _profecion)     
    {
        this.profecion = _profecion;
    }

    public int getSalario()
    {
        return salario;
    }
    public void setSalario(int _salario)
    {
        this.salario = _salario;
    }
}
