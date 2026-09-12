# Foram implementado a submissão de artigos


Duas rotas foram criadas, uma para submissão de artigos, e outra para envio dos metadados


exemplo de uso:


```bash

# observação
#Verificar se o comniho do arquivo está correto
# Fiz a requisição estando na pasta do arquivo

$ curl -X POST http://localhost:8080/api/v1/arquivos/upload  \
 -F "arquivo=@arquivo-test.txt"


# Resposta
{"id":"3bfc951b-1414-4745-8270-7ea2980e3a5e","nomeOriginal":"arquivo-test.txt","caminhoArmazenado":"uplo270-7ea2980e3a5e.txt","tamanhoBytes":1882,"mensagem":"Arquivo salvo com sucesso"}

```

Após a submissão será criado uma pasta de uploads com cada arquivo
O nome será alterado pelo id de cada arquivo