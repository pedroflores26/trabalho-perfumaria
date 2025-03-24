package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TrabalhoPedro {

    public ArrayList<String> listaPadrao;
    public ArrayList<String> listaOrganizada;

    public TrabalhoPedro() {
        listaPadrao = new ArrayList<>();
        listaOrganizada = new ArrayList<>();
    }

    
    public void salvar(String produto) {
        listaPadrao.add(produto); 
        listaOrganizada.add(produto);   
        JOptionPane.showMessageDialog(null, produto + " Salvo com sucesso");
    }

   
    public String listar() {
        String resultado = "Lista de produtos\n";
        
        if (!listaOrganizada.isEmpty()) {
            for (int i = 0; i < listaOrganizada.size(); i++) {
                resultado += listaOrganizada.get(i) + "\n";
            }
        } else {
            resultado = "Lista vazia!!";
        }

        return resultado;
    }

    
    public void excluir(int cod) {
        if (!listaOrganizada.isEmpty()) {
            cod = cod - 1;  
            if (cod >= 0 && cod < listaOrganizada.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o "
                        + listaOrganizada.get(cod), "Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    listaPadrao.remove(cod);
                    listaOrganizada.remove(cod); 
                    JOptionPane.showMessageDialog(null, "Excluído com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código errado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir da lista vazia");
        }
    }

   
    public int quantidade() {
        return listaPadrao.size();
    }

   
    public void limparLista() {
        listaPadrao.clear();
        listaOrganizada.clear();
    }

   
    public void alterar(int cod, String novoNome) {
        if (!listaOrganizada.isEmpty()) {
            cod = cod - 1;  
            if (cod >= 0 && cod < listaOrganizada.size()) {
                if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar o "
                        + listaOrganizada.get(cod), "Alteração", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    listaPadrao.set(cod, novoNome);  
                    listaOrganizada.set(cod, novoNome); 
                    JOptionPane.showMessageDialog(null, "Alterado com perfeição");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código errado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar uma lista vazia");
        }
    }

    
    public void ordenarAlfabeticamente() {
        listaOrganizada.sort(String::compareTo);
    }

   
    public void resetarLista() {
        listaOrganizada.clear(); 
        listaOrganizada.addAll(listaPadrao);
    }

    
    public void limpar() {
        listaPadrao.clear();
        listaOrganizada.clear();
    }
}
