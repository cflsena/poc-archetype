# ONE OS Archetype

Archetype baseado no **projeto modelo** (link) para criação de microsserviços, seguindo a arquitetura hexagonal.

## Instalação

Clonar o projeto archetype.

Instalar o archetype, no seu repositório maven local, através do comando:
```
$ mvn install
```

## Criando um microsserviço a partir do Archetype

Navegue até o diretório que deseja gerar o microsserviço e execute:

```
$ mvn archetype:generate -DarchetypeCatalog=local
```

Você verá uma saída similar a esta:

```
Choose archetype:
1: local -> br.com.oneos.ms.base:oneos-ms-base-archetype (oneos-ms-base-archetype)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
```

Escolha o archetype **oneos-ms-base-archetype** (neste caso 1) e preencha as informações do projeto. Exemplo:

```
Define value for property 'groupId': br.com.oneos.account
Define value for property 'artifactId': oneos-account
Define value for property 'version' 1.0-SNAPSHOT: : 1.0.0-SNAPSHOT
Define value for property 'package' br.com.oneos.account: : br.com.oneos
Confirm properties configuration:
groupId: br.com.oneos.account
artifactId: oneos-account
version: 1.0.0-SNAPSHOT
package: br.com.oneos
 Y: : Y
 ```
Para a padronização de todos os microsserviços, gerados a partir deste archetype, seguir o padrão:
- **'groupId'**: br.com.oneos.**nome_contexto_microsservico**
- **'artifactId'**: oneos-**nome_contexto_microsservico**
- **'version'**: todos os microsserviços nascerão como 1.0.0-SNAPSHOT
- **'package'**: br.com.oneos

No diretório atual, você verá o microsserviço gerado (via archetype), com a seguinte estrutura:
```
📦oneos-account
 ┣ 📂adapters
 ┣ 📂client
 ┣ 📂contract
 ┣ 📂core
 ┣ 📂coverage-report
 ┣ 📜Dockerfile
 ┗ 📜pom.xml
```
## Como gerar o archetype

Clonar o projeto **oneos-ms-base** (link).

Na raiz do projeto clonado, executar o seguinte comando:
```
$ mvn archetype:create-from-project
```
Ao final da execução deste comando, você verá uma saída similar a esta:

```
[INFO] Reactor Summary for oneos-ms-base 1.0-SNAPSHOT:
[INFO] 
[INFO] oneos-ms-base ...................................... SUCCESS [  2.387 s]
[INFO] contract ........................................... SKIPPED
[INFO] core ............................................... SKIPPED
[INFO] client ............................................. SKIPPED
[INFO] adapters ........................................... SKIPPED
[INFO] coverage-report .................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
Navegue até o diretório: ```../oneos-ms-base/target/generated-sources/archetype``` e copie todo o conteúdo deste diretório.

Exclua todo o conteúdo do projeto archetype (com exceção do README) e cole todo o conteúdo que foi gerado no passo anterior.

Por fim, execute o passo de instalação novamente e faça commit and push do archetype gerado para o repositório.

## Observações

- Qualquer alteração que seja necessária neste template, deverá ser feita no **projeto modelo** (link)
- É muito importante seguir os padrões de **groupId**, **artifactId**, **packages** etc, descritos neste README, para que todos os microsserviços gerados estejam no mesmo padrão.

| Versão | Descrição           | Solicitante                  | Data         |
|:-------|:--------------------|:-----------------------------|:-------------|
| 1.0.0  | Estrutura inicial   | Bruno Chiaroni               | 18/05/2022   |