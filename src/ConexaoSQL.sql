

-- Create the table in the specified schema
CREATE TABLE Salas
(
    SalaId INT NOT NULL PRIMARY KEY,
    NomeSala [NVARCHAR](50) NOT NULL,
    Capacidade [INT] NOT NULL,
    QuantidadePessoa [INT] NOT NULL,
);

CREATE TABLE Pessoas
(
    PessoasId INT NOT NULL PRIMARY KEY,
    NomePessoa [NVARCHAR](10) NOT NULL,
    SobrenomePessoa [NVARCHAR] (10) NOT NULL,
    SalaPessoa[NVARCHAR] NOT NULL,
);

CREATE TABLE Espacos
(
    EspacosId INT NOT NULL PRIMARY KEY,
    NomeEspaco [NVARCHAR] (10) NOT NULL,
    CapacidadeEspaco [INT] NOT NULL,
);

GO