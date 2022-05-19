package main;

public class TorpedoTeszt 
{
    private Hajo hajo;
    
    public String tesztLoves(int poz)
    {
        return "";
    }
    
    public static void main(String[] args) 
    {
        Hajo hajo= new Hajo();
        String t=hajo.talalat(4);
        assert t.equals("találat"):"nem jó a találat ellenörzése";
    }
}
