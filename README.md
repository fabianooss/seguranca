
### Baseado no artigo 

[Medium](https://medium.com/@harittweets/securing-your-apis-when-building-web-applications-5643d12e84d8)

Passos

1) Acessar localhost:8080

2) Ao fazer o login com o google, será gerado no console o ID Token

3) POST localhost:8080/login com Header X-ID-TOKEN <<ID Token>>

4) Irá retornar um header authorization

5) Fazer as requisições utilizando o token authorization
	GET localhost:8080/rest/hello header Bearer eyJhbGciOiJIUzUxM....
	



