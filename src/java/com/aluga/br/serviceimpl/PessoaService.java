/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aluga.br.serviceimpl;

import com.aluga.br.Entity.Pessoa;
import com.aluga.br.service.IPessoaSevice;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author David
 */
@Stateless
public class PessoaService implements IPessoaSevice {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Pessoa> listar() {

        TypedQuery<Pessoa> pessoaQuery
                = em.createQuery("select p from Pessoa as p",
                        Pessoa.class);

        return pessoaQuery.getResultList();

    }
    
    

    @Override
    public String salvar(Pessoa pessoa) {
        
        
        pessoa.setNome("david");
        pessoa.setCpf(1234567899);

        try {
            if (pessoa.getIdPessoa() == null) {
                em.persist(pessoa);

            } else {
                em.merge(pessoa);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }

        System.out.println("funcionou");
        return null;

    }

    @Override
    public String excluir(Integer IdPessoa) {

        try {
            Pessoa pessoa
                    = em.find(Pessoa.class,
                            IdPessoa);

            em.remove(pessoa);
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }

        return null;
    }
}
