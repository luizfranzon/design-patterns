namespace DPStrategy;

public class Pedido(float valor, IFrete tipoFrete)
{
    public float Valor = valor;
    private IFrete TipoFrete = tipoFrete;

    public void PrintInformation()
    {
        Console.WriteLine($"Valor: R${Valor}");
        Console.WriteLine($"Tipo Frete: R${TipoFrete}");
        Console.WriteLine($"Valor frete: R${CalculaFrete()} \n");
    }
    public void SetFrete(IFrete frete)
    {
        TipoFrete = frete;
    }

    public double CalculaFrete()
    {
        return TipoFrete.Calcula(Valor);
    }
}