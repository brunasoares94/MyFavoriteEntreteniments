package hortifruti;

/**
 *
 * @author Bruna Soares
 */
public class produto {
    private String nome;
    private int vencimento;
    private int quantidade;
    private boolean estoque;
   
    /**
     *
     * @param nome
     */
    public void nomeProdu(String nome){
      this.nome = nome;     
}

public void dataVenci(int vencimento){
    this.vencimento = vencimento;
    
}
public void quantFru(int quantidade){
    this.quantidade = quantidade;
}
public boolean estoque(){
    return estoque;
}

public String pegarNome(){
        return this.nome;
    }
public int pegarQuant(){
        return this.quantidade;
    }
public int pegarVenci(){
        return this.vencimento;
    }
//Atualização
public void venda(int venda){
    this.quantidade-=venda;
}
public void validade(int validade){
    this.vencimento-=validade;
}
public boolean estoque(int quantidade){
    if (quantidade>0) {
    return true;
   }return false;
}

    public void quantPro(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void datVenci(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void nomePro(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

	
