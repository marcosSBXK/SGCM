create database AQME;

use AQME;

create table Recepcionista(
	idRecepcionista int auto_increment not null,
    nomeRecepcionista varchar(50),
    senhaRecepcionista varchar(50),
	primary key(idRecepcionista)
);

create table Servico(
	tipo varchar(50),
    descricao varchar(100),
    especialidade varchar(50),
    crmMedico varchar(5)
);

create table Seguros(
	tipo varchar(50),
    dataa varchar(50),
    validade varchar(50),
    preco varchar(50),
    statuss boolean
);    

create table PrevencaoIncendio(
	extintorInmetro varchar(50),
    qtdExtintores int,
    validade varchar(50),
    inpecao varchar(50),
    statuss boolean
);

create table Paciente(
	codPaciente int auto_increment not null,
    cpfPaciente varchar(13),
    nomePaciente varchar(50),
    telPaciente varchar(10),
    primary key(codPaciente)
);

create table NotaServico(
	idNota int auto_increment not null,
    codPaciente integer,
    tipo varchar(50),
    dataa varchar(50),
    horario varchar(50),
    primary key(idNota),
    foreign key(codPaciente) references Paciente(codPaciente),
    foreign key(tipo) references Servico(tipo)
);
	
create table Monitoramento(
    cameras varchar(20),
    dataa varchar(20),
    hora varchar(20),
    statuss boolean
);

create table Manutencao(
	idManuntecao int auto_increment not null,
    elevador varchar(50),
    dataa varchar(50),
    validade varchar(50),
    primary key(idManuntecao)
);

create table Lixo(
	dia varchar(20),
    descarte varchar(20),
    reciclavel varchar(20)
);

create table Limpeza(
	banheiro varchar(20),
    quarto varchar(20),
    corredor varchar(20),
    recepcao varchar(20),
    externo varchar(20),
    escritorio varchar(20),
    dia varchar(20)
);
 
 create table Exame(
	valorExame Double,
    dataa varchar(20),
    horario varchar(20),
    dataResultado varchar(20)
);

create table Estacionamento(
	horaEntrada varchar(20),
    horaSaida varchar(20),
    placaVeiculo varchar(20),
    numvagas integer
);

create table Correio(
	 tipo varchar(20),
     dataEnvio varchar(20),
     dataReceb varchar(20)
);

create table Consumo(
	agua varchar(20),
    energia varchar(20),
    dataa varchar(20)
);

create table Consulta(
	valorConsulta Double,
    dataa varchar(20),
    horario varchar(20)
);

create table Ambiente(
	localidade varchar(50),
    condicoes varchar(50),
    condicoesEquip varchar(50)
);

create table Acesso(
	dataa varchar(20),
    rg varchar(9),
    nome varchar(50),
    statuss boolean
);