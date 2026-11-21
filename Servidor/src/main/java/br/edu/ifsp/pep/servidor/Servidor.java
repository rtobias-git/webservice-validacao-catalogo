/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifsp.pep.servidor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author tobias
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Servidor {
    @WebMethod
    boolean verificarProduto(String nomeProduto);
}
