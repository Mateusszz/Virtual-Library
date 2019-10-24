package library;

import javax.swing.JOptionPane;

public class Biblioteca {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		JOptionPane.showMessageDialog(null, "                   Seja muito bem vindo  !",
				"                          Biblioteca virtual", JOptionPane.PLAIN_MESSAGE);

		int resposta = JOptionPane.showConfirmDialog(null,
				String.format("Para acessar a biblioteca é necessario fazer um cadastro ! %n             "
						+ "                 deseja cadastrar-se ?"),
				null, 0, JOptionPane.INFORMATION_MESSAGE);

		String matriculaS;
		int matriculaI;
		
		String cpfS;
		int cpfI;
		

		do {
			if (resposta == 0) {
				p.nome = JOptionPane.showInputDialog(null, "Digite seu nome completo : ",
						"                              CADASTRO", JOptionPane.PLAIN_MESSAGE);
				p.formataNome();
				resposta++;
				
				matriculaS = JOptionPane.showInputDialog(null, "Digite o número da sua matrícula", 
						     "                              CADASTRO", JOptionPane.PLAIN_MESSAGE);
				matriculaI = Integer.parseInt(matriculaS);
				p.setMatricula(matriculaI);
				
				cpfS = JOptionPane.showInputDialog(null, "Digite seu CPF : ",
						 "                             CADASTRO",JOptionPane.PLAIN_MESSAGE);
				cpfI = Integer.parseInt(cpfS);
				p.setCpf(cpfI);
				
				p.nomeInstituicao = JOptionPane.showInputDialog(null,"Digite o nome da instituição : ", 
						 "                             CADASTRO" ,JOptionPane.PLAIN_MESSAGE);
				
			    

			} else {

				JOptionPane.showMessageDialog(null,
						String.format("Para o acesso ser permitido %n é necessário efetuar o cadastro"),
						"                         MENSSAGEM", JOptionPane.WARNING_MESSAGE);
				
				resposta = JOptionPane.showConfirmDialog(null, String.format("      deseja cadastrar-se ?"), null, 0,
						JOptionPane.INFORMATION_MESSAGE);
			}

		} while (resposta == 0);

	}

}
