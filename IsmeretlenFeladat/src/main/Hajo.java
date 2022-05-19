package main;

public class Hajo 
{
    private int [] pozicio= new int [3];

    public Hajo(/*int poz1, int poz2, int poz3*/) 
    {
        pozicio= new int[]{2, 3, 4};
//        pozicio= new int[]{poz1, poz2, poz3};
//        pozicio[1]=3;
//        pozicio[2]=4;
//        this.pozicio[0]=pozicio[2];
//        this.pozicio[1]=pozicio[3];
//        this.pozicio[2]=pozicio[4];
//        pozicio[0]=poz1;
//        pozicio[1]=poz2;
//        pozicio[2]=poz3;
//        pozicio[1]=pozicio[3];
//        pozicio[2]=pozicio[4];
    }
    
    public String talalat(int poz)
    {
        String valasz="Sikeres találat";
        for (int i = 0; i < pozicio.length; i++) 
        {
            System.out.println(pozicio[i]);
            if(pozicio[i]==poz)
            {
                
                System.out.println(valasz+": "+poz);
            }
        }
        return valasz;
    }
}
