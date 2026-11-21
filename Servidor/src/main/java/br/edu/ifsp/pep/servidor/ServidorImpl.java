/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.servidor;

import com.sun.xml.ws.developer.SchemaValidation;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author tobias
 */
@SchemaValidation
@WebService(endpointInterface = "br.edu.ifsp.pep.servidor.Servidor")
public class ServidorImpl implements Servidor{
    
    private CatalogoProdutos catalogo = new CatalogoProdutos();
            
    @Override
    public boolean verificarProduto(String nomeProduto) {
        int i = 0;
        boolean encontrou = false;
        List<String> produtos = catalogo.getProdutos();
        nomeProduto = nomeProduto.trim();
        
        while(encontrou == false && i < produtos.size()){
            if(nomeProduto.toLowerCase().equals(produtos.get(i).toLowerCase())){
                encontrou = true;
            }
            i++;
        }
        
        return encontrou;
    }
    
}
