# Checkpoint 1 - Programação Orientada a Objetos

 ## Turma 07NT
 
 ### Alunos:
 > Everton Silvério
 > 
 > Manuel Jose Piñero

---

## PROPOSTA: Sistema de Vendas das Lojas CAPA FINA

### INTRODUÇÃO:
> **A Capa Fina é uma rede de varejo curitibana que se dedica à venda de acessórios para celulares, equipamentos eletrônicos e realiza consertos.**

Recentemente, a loja tem experimentado uma expansão pela sua política de preços competitiva, confiabilidade e bom atendimento. Sendo que até essa data já são mais de 7 lojas espalhadas pela cidade de Curitiba e com expectativa de abrir mais 5 lojas na região metropolitana e interior do PR. Visando ter um melhor controle das operações e melhorar seus serviços. Seu dono solicita nosso equipo de TI para criarmos um aplicativo em JAVA que permita o gerenciamento das operações da loja. 

Dessa forma, eles esperam melhorar o fluxo dos atendimentos e guardar informações pertinentes às lojas, suas características, nível de vendas, informações sobre os usuários e o que normalmente eles procuram para assim oferecer uma experiencia mais personalizada e eficiente. 
Anteriormente eles usavam um sistema padrão para gestão de lojas, controle de estoque e vendas que não estava adaptado para o setor de eletrônicos e vendas de acessórios de celulares, nem tinha como incorporar orçamentos de consertos ou muito menos os elementos que permitissem aos funcionários, realizar cálculos do seu salário de acordo com a função que desempenham e o adicional por vendas/consertos se tiver. Para isso, nossa equipe irá a desenvolver o aplicativo levando em consideração os seguintes critérios. 

### CENÁRIO DA APLICAÇÃO:
O nosso sistema começara com **_as lojas_**, cada loja tem seu endereço físico, um CNPJ do socio responsável, seu número de telefone e seu horário de atendimento. 

Cada loja tem também seus **_funcionários_**, realiza vendas de acessórios e faz consertos de celulares. 

Para trabalhar na loja, um funcionário deve proporcionar os seguintes dados: 
Um tipo e nro. de documento de identidade, seu nome completo, data de nascimento, endereço residencial. 

Os **_funcionários_** das lojas são divididos em 3 categorias: 

**_O gerente_**: que pode ser o socio ou um funcionário contratado, ele desempenha a função de organizar a equipe, realizar a contabilidade, contatar fornecedores e fazer pedidos. Seu salário é de 3500 mais um adicional de 0,5% do valor das vendas e consertos sempre que a meta for atingida. 

**_Os vendedores_**: que ficam no balcão atendendo os clientes, executando as vendas e conferindo os estoques. Eles recebem salário de 2300, mas o 1% das vendas da loja se bater a meta. 

**_Os técnicos_**: têm a função de avaliar o aparelho e determinar quais dos 4 tipos de conserto será executado: trocar a tela, trocar a placa mãe do aparelho, realizar uma limpeza interna, resolver problemas de software. Seu salário é de 1800 reais, mas eles recebem o 25% do valor de cada conserto realizado. 

**_Os acessórios_** vendidos na loja cada um tem seu nome, código, quantidade em estoque, uma breve descrição e preço. Eles são todos agrupados em 3 categorias: acessórios para celular, tablet ou computador e finalmente eletrônicos em geral. Essa divisão precisa ser realizada pois o nosso cliente comentou que a loja está expandindo seu catálogo de produtos e precisa saber qual é o volume de vendas e a recepção dos clientes para se moldar mais aos seus hábitos de compra. 

Finalmente, **_os clientes_** da loja são cadastrados com seu CPF, nome, um número de telefone, e região onde mora na cidade, eles tem os pedidos que podem ser duas categorias: comprar acessórios da loja ou solicitar o conserto do aparelho.

### DIAGRAMA

A partir desses dados foi criado o seguinte diagrama de classes UML:

![image](https://user-images.githubusercontent.com/5773748/172977403-8081ccad-7714-4845-b99e-96a04cd6948e.png)

