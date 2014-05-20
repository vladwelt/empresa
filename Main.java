package empresa;

class Main
{
    public static void main(String []args){
        Empresa miEmpresa = new Empresa();
        miEmpresa.setNombre("SCESI");
        miEmpresa.setFechaFundacion(new Fecha(24,Mes.MAYO,2014));
        Empleado miEmpleado = new Empleado();
        Herramienta h = new Herramienta();
        miEmpresa.imprimirNombre();
    }
}
