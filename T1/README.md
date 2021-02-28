# Compiladores

Alunos:
- Alcides Mignoso e Silva - 760479
- Matheus Victorello      - 758606

## T1

Para rodar o trabalho são necessários seguir os passos de "clone", "build" e "run", descritos abaixo. É válido ressaltar que é necessário que os comandos sejam utilizados dentro de um ambiente Linux.

### Clone

Antes de tudo, é necessário baixar o projeto e configurá-lo. Pode-se fazer o clone do repositório do github rodando:
```git
git clone repo
```
Após isso, entre na pasta do T1 digitando:
```bash
cd T1
```

Para fazer o build e run do projeto, pode-se utilizar o Makefile disponibilizado. Para isso, é necessário atualizar algumas variáveis dentro do arquivo "Makefile" de acordo com as especificações abaixo:

- `AGENT`: _path_ do corretor. `DEFAULT: agent.jar`
- `GCC`: _path_ para o executável do gcc. `DEFAULT: /bin/gcc`
	- Versão utilizada: `gcc version 10.2.0 (GCC)`
- `TMP`: _path_ para uma pasta temporária onde serão armazenados os _outputs_. `DEFAULT: /tmp`
- `JAVA_HOME`: _path_ para a pasta onde está instalada uma JVM. `DEFAULT: /usr/lib/jvm/default`
	- Versão utilizada: provida pelo `openjdk 15.0.2 2021-01-19`
- `MAVEN`: _path_ para o binário do maven. `DEFAULT: /usr/lib/netbeans/java/maven/bin/mvn`
	- Versão utilizada: `Apache Maven 3.6.3`

### Build

Após configuradas as variáveis, pode-se fazer o build do projeto pelo terminal, digitando:


```
make build
```

### Run

Por fim, pode-se rodar os testes utilizando


```
make run-tests
```

Output esperado:
```
...

Execução finalizada
Verificando resultado
Resultado verificado


==================================
Nota do grupo "760479,758606":
CT Léxico = 10.0 (37/37)
CT Sintático = 0.0 (0/0)
CT Semântico = 0.0 (0/0)
CT Gerador = 0.0 (0/0)
==================================
```


### Run arbitrário

Para rodar manualmente com um arquivo de entrada qualquer, pode-se utilizar o script _run.sh_. Basta rodar:

- `./run.sh ARQUIVO_ENTRADA ARQUIVO_SAIDA`
