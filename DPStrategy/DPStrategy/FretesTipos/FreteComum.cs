namespace DPStrategy.FretesTipos;

public class FreteComum : IFrete
{
    public double Calcula(double valor)
    {
        return valor * 0.05;
    }
}