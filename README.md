# training-mars-photos-starter
 
O que foi estudado até o momento com este codelab

Diponivel em  https://developer.android.com/courses/pathways/android-basics-compose-unit-5-pathway-1?hl=pt-br#codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-getting-data-internet

serviços web REST
Um serviço da Web é uma funcionalidade baseada em software, oferecida pela Internet, que permite que seu aplicativo faça solicitações e recupere dados.
Os serviços da Web comuns usam uma arquitetura REST  

Os serviços da Web que oferecem arquitetura REST são conhecidos como serviços RESTful . 

Os serviços da Web RESTful são criados usando componentes e protocolos da Web padrão.

Você faz uma solicitação para um serviço da Web REST de maneira padronizada por meio de URIs.

Para usar um serviço da Web, um aplicativo deve estabelecer uma conexão de rede e se comunicar com o serviço.

Em seguida, o aplicativo deve receber e analisar os dados de resposta em um formato que o aplicativo possa usar.

A biblioteca Retrofit é uma biblioteca cliente que permite que seu aplicativo faça solicitações para um serviço da Web REST.

Use conversores para dizer ao Retrofit o que fazer com os dados que ele envia para o serviço da web e recebe de volta do serviço da web.

Por exemplo, o ScalarsConvertertrata os dados do serviço da web como um Stringou outro primitivo.

Para permitir que seu aplicativo faça conexões com a Internet, adicione a "android.permission.INTERNET"permissão no manifesto do Android.

A inicialização preguiçosa delega a criação de um objeto na primeira vez em que ele é usado. Ele cria a referência, mas não o objeto. 

Quando um objeto é acessado pela primeira vez, uma referência é criada e usada todas as vezes a partir de então.
Análise JSON  A resposta de um serviço da Web geralmente é formatada em JSON , um formato comum para representar dados estruturados.

Um objeto JSON é uma coleção de pares chave-valor.

Uma coleção de objetos JSON é uma matriz JSON. Você obtém uma matriz JSON como resposta de um serviço da Web.

As chaves em um par chave-valor são colocadas entre aspas. Os valores podem ser números ou strings.

No Kotlin, as ferramentas de serialização de dados estão disponíveis em um componente separado, kotlinx.serialization .

O kotlinx.serialization fornece conjuntos de bibliotecas que convertem uma string JSON em objetos Kotlin.

Existe uma biblioteca Kotlin Serialization Converter desenvolvida pela comunidade para Retrofit: retrofit2-kotlinx-serialization-converter 

. O kotlinx.serialization corresponde às chaves em uma resposta JSON com propriedades em um objeto de dados com o mesmo nome.

Para usar um nome de propriedade diferente para uma chave, anote essa propriedade com a @SerialNameanotação e a chave JSON value.


![d6334e93f09038b_856](https://github.com/iagocarvalho07/basic-android-kotlin-compose-training-mars-photos-starter/assets/71970033/d3f5d3da-6285-4453-acb5-7a3ba2c05eeb)

