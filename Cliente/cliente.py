from zeep import Client

url = "http://127.0.0.1:8080/server?wsdl"

cliente = Client(url)

nomeProduto = input("Digite o nome do produto ou -1 para sair: ")

while nomeProduto != "-1":

    resultado = cliente.service.verificarProduto(nomeProduto)

    if resultado:
        print("O produto pertence ao catalogo da Rare Beauty")
    else:
        print("O produto nao pertence ao catalogo da Rare Beauty")

    nomeProduto = input("Digite o nome do produto ou -1 para sair: ")
    if(nomeProduto == "-1"):
        print("Programa finalizado \n")