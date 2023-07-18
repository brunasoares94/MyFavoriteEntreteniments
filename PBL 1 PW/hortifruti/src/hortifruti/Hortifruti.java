package hortifruti;

import hortifruti.produto;

import javax.swing.JOptionPane;

/**
 * @author Bruna Soares
 */
public class Hortifruti {

    public static void main(String[] args) {
        
        int menu=0;
        int menu2=0;
        int i=0;
       
         produto produto = new produto();
        do {            
           
            System.out.println("********Hortifruti Happy**********");
            System.out.println("[1]Cadastrar");
            System.out.println("[2]Atualizar");
            System.out.println("[3]Consultar");
            System.out.println("[4]Sair");
            menu= Integer.parseInt(JOptionPane.showInputDialog("Selecione uma Opçao:"));
           
            switch (menu) {
                case 1 -> {
                    prduto.nomePro(JOptionPane.showInputDialog("Digite o Nome do Produto:"));
                    produto.quantPro(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade")));
                    produto.datVenci(Integer.parseInt(JOptionPane.showInputDialog("Digite o Vencimento")));
                }
                case 2 -> {
                    System.out.println("[1]Atualizar a quantidade");
                    System.out.println("[2]Atualizar dias para o vencimento:");
                    menu2 = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções:"));
                   
                    switch (menu2) {
                        
                        case 1->{
                            boolean estoque = produto.estoque(produto.pegarQuant());
                            if (estoque) {
                            produto.venda(Integer.parseInt(JOptionPane.showInputDialog("Quantidade vendida:")));    
                            }else{
                                JOptionPane.showMessageDialog(null,"Estoque zerado!");
                            }  
                            
                        break;
                        }
                        case 2->{
                            produto.validade(Integer.parseInt(JOptionPane.showInputDialog("Quantos dias restam para o vencimento?")));
                        break;
                        }
                    }
                }
                
                case 3 -> {
                System.out.println(produto.pegarNome());
                System.out.println(produto.pegarQuant());
                System.out.println(produto.pegarVenci());              
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null,"Obrigado por utilizar!");
                }
                default -> JOptionPane.showMessageDialog(null,"Opção Invalida!");
            }
                   
           
        } while (menu != 4);
 
    }
   
}