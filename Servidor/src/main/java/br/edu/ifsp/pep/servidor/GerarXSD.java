package br.edu.ifsp.pep.servidor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GerarXSD {

    public static void gerar() {

        File arquivo = new File("produto.xsd");

        if (!arquivo.exists()) {

            try (FileWriter escritor = new FileWriter(arquivo)) {

                escritor.write("""
                    <?xml version="1.0" encoding="UTF-8"?>
                    
                    <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
                    
                        <xs:element name="verificarProduto">
                            <xs:complexType>
                                <xs:sequence>
                                    <xs:element name="nomeProduto" type="xs:string"/>
                                </xs:sequence>
                            </xs:complexType>
                        </xs:element>
                    
                        <xs:element name="verificarProdutoResposta">
                            <xs:complexType>
                                <xs:sequence>
                                    <xs:element name="retorno" type="xs:boolean"/>
                                </xs:sequence>
                            </xs:complexType>
                        </xs:element>
                    
                    </xs:schema>
                    """);

                System.out.println("Arquivo XSD criado");

            } catch (IOException e) {

                System.out.println("Erro ao gerar XSD: " + e.getMessage());

            }

        } else {

            System.out.println("XSD já existe");

        }
    }
}
