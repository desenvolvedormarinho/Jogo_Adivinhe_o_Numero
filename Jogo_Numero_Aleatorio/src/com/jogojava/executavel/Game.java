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

			JOptionPane.showMessageDialog(null, "Bem vindo! Vamos ver como estão seus palpites hoje!! ");

			user.setNome(JOptionPane.showInputDialog("Me diga seu nome "));
			user.setIdade(
					Integer.valueOf(JOptionPane.showInputDialog("Show! Agora me diga sua idade (só os números)")));

			JOptionPane.showMessageDialog(null, "Muito bom ter você aqui " + user.getNome());
			JOptionPane.showMessageDialog(null, "Legal, vi aqui que você tem " + user.getIdade() + " Anos");
			int op = JOptionPane.showConfirmDialog(null, "Vamos Jogar?");

			if (op == 1) {
				JOptionPane.showMessageDialog(null, "Tudo bem! Quem sabe na próxima... ");
			} else if (op == 0) {
				JOptionPane.showMessageDialog(null, "Ok! o jogo funciona assim");
				JOptionPane.showMessageDialog(null, "Eu escolho um número de 0  a 10 e você tenta adivinhar");
				JOptionPane.showMessageDialog(null, "Muito Simples!!! Mas não vou te dar nenhum palpite hein..");

				int escPc = ger.nextInt(11);

				JOptionPane.showMessageDialog(null, user.getNome() + " Eu já escolhi o número");

				do {

					escUser = Integer.valueOf(JOptionPane.showInputDialog("Agora me diga qual o seu palpite "));

					if (escUser != escPc) {
						JOptionPane.showMessageDialog(null, "Palpite errado! vai tentando, confio em você");
					} else {
						JOptionPane.showMessageDialog(null, "Sabia que vc tinha potencial! Parabéns");
					}

				} while (escPc != escUser);
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Você deve informar um número! Volte e tente novamente");
		}finally {
			JOptionPane.showMessageDialog(null, "Obrigado por jogar comigo! Volte sempre..");
		}

	}

}
