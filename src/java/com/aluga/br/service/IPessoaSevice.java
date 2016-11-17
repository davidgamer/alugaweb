/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aluga.br.service;

import com.aluga.br.Entity.Pessoa;
import java.util.List;

/**
 *
 * @author David
 */
public interface IPessoaSevice {
    
    
    public List<Pessoa> listar();
    
    public String salvar(Pessoa pessoa);
    
    public String excluir(Integer IdPessoa);
    
}
