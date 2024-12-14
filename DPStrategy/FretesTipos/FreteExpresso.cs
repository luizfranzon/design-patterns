namespace DPStrategy.FretesTipos;

public class FreteExpresso : IFrete
{
    public double Calcula(double valor)
    {
        return valor * 0.10;
    }
}