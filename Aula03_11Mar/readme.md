# Aula 03 (11/03) - Pilhas e Filas (Alocação Estática)

## Pilhas (Stack)

São estruturas de dados do tipo LIFO (last-in first-out), onde o último elemento a ser inserido, será o primeiro a ser retirado. Assim, uma pilha permite acesso a apenas um item de dados - o último inserido. Para processar o penúltimo item inserido, deve-se remover o último.

![](https://miro.medium.com/v2/resize:fit:1280/1*lb-0r80YYhcnoVcQ3HY-1g.gif)

São exemplos de uso de pilha em um sistema:

* Funções recursivas em compiladores;
* Mecanismo de desfazer/refazer dos editores de texto;
* Navegação entre páginas Web;

A implementação de pilhas pode ser realizada através de vetor (alocação do espaço de memória para os elementos é contígua) ou através de listas encadeadas (em breve).

Numa pilha, a manipulação dos elementos é realizada em apenas uma das extremidades, chamada de topo, em oposição a outra extremidade, chamada de base.

## Filas (Queue)

São estruturas de dados do tipo FIFO (first-in first-out), onde o primeiro elemento a ser inserido, será o primeiro a ser retirado, ou seja, adiciona-se itens no fim e remove-se do início.

![](https://images.ctfassets.net/n9ktizb80e1a/6FJgRmnaa4aPhL7vn8TGd4/9bd02c6c3d5337d42a7f933b5740006f/queue.gif)

São exemplos de uso de fila em um sistema:

* Controle de documentos para impressão;
* Troca de mensagem entre computadores numa rede;

A implementação de filas pode ser realizada através de vetor (alocação do espaço de memória para os elementos é contígua) ou através de listas encadeadas (em breve)

