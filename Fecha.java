package empresa

public class Fecha
{
    private int dia;
    private Mes mes;
    private int anio;

    public Fecha()
    {
    }

    public void setDia(int _dia)
    {
        this.dia = _dia;
    }

    public void setmes(String _mes)
    {
        this.mes = _mes;
    }

    public void setAnio(int _anio)
    {
        this.anio = _anio;
    }

    public int getDia()
    {
        return dia;
    }

    public Mes getMes()
    {
        return mes;
    }

    public int getAnio()
    {
        return anio;
    }
}
