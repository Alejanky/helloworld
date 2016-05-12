public class guardias
{
  private int horasalida,horaentrada;
  private String Nombre,Correo;
  public guardias()
  {
    sethre(00);
    sethrs(00);
    setnom("default");
    setcorr("alejandr_venegas@hotmail.com");
  }//public guardias()
  public guardias(int x)
  {
    sethre(x);
    sethrs(00);
    setnom("default");
    setcorr("alejandr_venegas@hotmail.com");
  }//public guardias(int x)
  public guardias(int x, int y)
  {
    sethre(x);
    sethrs(y);
    setnom("default");
    setcorr("alejandr_venegas@hotmail.com");
  }//public guardias(int x, int y)
  public guardias(int x,int y, String z)
  {
    sethre(x);
    sethrs(y);
    setnom(z);
    setcorr("alejandr_venegas@hotmail.com");
  }//public guardias(int x,int y, String z)
  public guardias(int x,int y, String z, String w)
  {
    sethre(x);
    sethrs(y);
    setnom(z);
    setcorr(w);
  }//  public guardias(int x,int y, String z, String w)
  public void setcorr(String x)
  {
    Correo= new String(x)
  }//public void setcorr()
  public void sethrs(int x)
  {
    horasalida= x
  }//public void sethrs(int x)
  public void sethre(int x)
  {
    horaentrada= x;
  }//public void sethre(int x)
  public void setnom(String x)
  {
    Nombre= new String(x);
  }//public void setnom(String x)
  public int gethrs()
  {
    return horasalida;
  }//public void gethrs()
  public int gethre()
  {
    return horaentrada;
  }//public void gethre()
  public String getnom()
  {
    return Nombre;
  }//public void getnom()
  public String getcorr()
  {
    return Correo;
  }//public String getcorr()
}//public class guardias
