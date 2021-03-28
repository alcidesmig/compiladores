# Compiladores

## T2

Para rodar o trabalho são necessários seguir os passos de "clone", "build" e "run", descritos abaixo. É válido ressaltar que é necessário que os comandos sejam utilizados dentro de um ambiente Linux.

### Clone

Antes de tudo, é necessário baixar o projeto e configurá-lo. Pode-se fazer o clone do repositório do github rodando:
```git
git clone https://github.com/alcidesmig/compiladores/
```

### Pastas

Navegue até a pasta atual utilizando
```bash
cd compiladores/T2
```

### Build

Caso seja necessário, pode-se utilizar o código executável presente na pasta `bin`, na raiz do projeto.

Para fazer o build e run do projeto, pode-se utilizar o Makefile disponibilizado. Para isso, é necessário atualizar algumas variáveis dentro do arquivo "Makefile" de acordo com as especificações abaixo:

- `AGENT`: _path_ do corretor. `DEFAULT: agent.jar`
- `GCC`: _path_ para o executável do gcc. `DEFAULT: /bin/gcc`
	- Versão utilizada: `gcc version 10.2.0 (GCC)`
- `TMP`: _path_ para uma pasta temporária onde serão armazenados os _outputs_. `DEFAULT: /tmp`
- `JAVA_HOME`: _path_ para a pasta onde está instalada uma JVM. `DEFAULT: /usr/lib/jvm/default`
	- Versão utilizada: provida pelo `openjdk 15.0.2 2021-01-19`
- `MAVEN`: _path_ para o binário do maven. `DEFAULT: /usr/lib/netbeans/java/maven/bin/mvn`
	- Versão utilizada: `Apache Maven 3.6.3`

Após configuradas as variáveis, pode-se fazer o build do projeto pelo terminal, digitando:

```
make build
```

Obs: caso seja necessário, pode-se utilizar o código executável presente na pasta `bin`, na raiz do projeto.

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
CT Léxico = 0.0 (0/0)
CT Sintático = 10.0 (62/62)
CT Semântico = 0.0 (0/0)
CT Gerador = 0.0 (0/0)
==================================
```


### Run arbitrário

Para rodar manualmente com um arquivo de entrada qualquer, pode-se utilizar o script _run.sh_. Basta rodar:

- `./run.sh ARQUIVO_ENTRADA ARQUIVO_SAIDA`
