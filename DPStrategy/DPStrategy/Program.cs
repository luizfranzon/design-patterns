using DPStrategy;
using DPStrategy.FretesTipos;

FreteComum freteComum = new FreteComum();
FreteExpresso freteExpresso = new FreteExpresso();
FreteAgendado freteAgendado = new FreteAgendado();

Pedido pedido1 = new Pedido(100, freteComum);
Pedido pedido2 = new Pedido(200, freteComum);

pedido1.PrintInformation();

pedido1.SetFrete(freteExpresso);

pedido1.PrintInformation();

pedido2.PrintInformation();

pedido2.SetFrete(freteExpresso);

pedido2.PrintInformation();

Pedido pedido3 = new Pedido(300, freteAgendado);
