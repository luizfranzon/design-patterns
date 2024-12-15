namespace DPStrategy.FretesTipos;

public class FreteAgendado : IFrete
{
    public double Calcula(double valor)
    {
        return valor * 0.08;
    }
}