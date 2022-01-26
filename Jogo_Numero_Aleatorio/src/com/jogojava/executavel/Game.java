package com.jogojava.executavel;

import java.util.Random;

import javax.swing.JOptionPane;

import com.jogojava.entities.User;

public class Game {

	public static void main(String[] args) {

		try {

			User user = new User();

			Random ger = new Random();

			int escUser;

			JOptionPane.showMessageDialog(null, "Bem vindo! Vamos ver como est�o seus palpites hoje!! ");

			user.setNome(JOptionPane.showInputDialog("Me diga seu nome "));
			user.setIdade(
					Integer.valueOf(JOptionPane.showInputDialog("Show! Agora me diga sua idade (s� os n�meros)")));

			JOptionPane.showMessageDialog(null, "Muito bom ter voc� aqui " + user.getNome());
			JOptionPane.showMessageDialog(null, "Legal, vi aqui que voc� tem " + user.getIdade() + " Anos");
			int op = JOptionPane.showConfirmDialog(null, "Vamos Jogar?");

			if (op == 1) {
				JOptionPane.showMessageDialog(null, "Tudo bem! Quem sabe na pr�xima... ");
			} else if (op == 0) {
				JOptionPane.showMessageDialog(null, "Ok! o jogo funciona assim");
				JOptionPane.showMessageDialog(null, "Eu escolho um n�mero de 0  a 10 e voc� tenta adivinhar");
				JOptionPane.showMessageDialog(null, "Muito Simples!!! Mas n�o vou te dar nenhum palpite hein..");

				int escPc = ger.nextInt(11);

				JOptionPane.showMessageDialog(null, user.getNome() + " Eu j� escolhi o n�mero");

				do {

					escUser = Integer.valueOf(JOptionPane.showInputDialog("Agora me diga qual o seu palpite "));

					if (escUser != escPc) {
						JOptionPane.showMessageDialog(null, "Palpite errado! vai tentando, confio em voc�");
					} else {
						JOptionPane.showMessageDialog(null, "Sabia que vc tinha potencial! Parab�ns");
					}

				} while (escPc != escUser);
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Voc� deve informar um n�mero! Volte e tente novamente");
		}finally {
			JOptionPane.showMessageDialog(null, "Obrigado por jogar comigo! Volte sempre..");
		}

	}

}
