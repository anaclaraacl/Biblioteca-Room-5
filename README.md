O projeto BhBusMetrop foi desenvolvido para gerenciar e persistir informações sobre o tráfego de ônibus na região metropolitana de Belo Horizonte. A aplicação mobile, desenvolvida em Kotlin, utiliza a biblioteca Room para persistência de dados em um banco de dados SQLite.

Funcionalidades
Persistência de Dados: A aplicação armazena informações sobre os ônibus que passam pela região metropolitana.
CRUD Completo: Implementa os métodos padrões de CRUD (Create, Read, Update, Delete) para gerenciar os dados dos ônibus.

Modelagem de Dados
O projeto possui uma estrutura básica para representar as informações dos ônibus com a seguinte modelagem:

id: Identificador único do ônibus (Integer).
nome: Nome ou designação do ônibus (String).
numero: Número da linha do ônibus (Integer).
cor: Cor do ônibus (String).
tipo: Tipo de transporte, por exemplo, "Ônibus" (String).
peso: Peso do ônibus em quilogramas (String).

Estrutura do Projeto
Model: Representa a entidade do ônibus com as propriedades mencionadas.
DAO (Data Access Object): Interface para definir as operações de acesso aos dados, incluindo métodos para criar, ler, atualizar e excluir registros.
AppDatabase: Classe abstrata que define a base de dados e integra o Room para gerenciar a persistência.
