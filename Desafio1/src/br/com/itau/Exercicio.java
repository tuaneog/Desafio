package br.com.itau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;

public class Exercicio {

	public static void main(String[] args) {
		List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
		
		//TODO: continue daqui
		printaGastosPorMes(lancamentos);

		Scanner scan = new Scanner(System.in);

        System.out.println("Digite a categoria desejada: ");
        int categoria = scan.nextInt();
		printaLancamentoPorCategoria(lancamentos, categoria);


        System.out.println("Digite o mês da fatura: ");
        int mes = scan.nextInt();
		printaFaturaPorMes(lancamentos, mes);
	}

	public static void printaGastosPorMes(List<Lancamento> listaDeLancamento){
		for(int i = 0; i < 12; i++){
			List<Lancamento> lancamentosDoMes = new ArrayList<>();
			for(int j = 0; j < listaDeLancamento.size(); j++){
				if(listaDeLancamento.get(j).getMes() == i){
					lancamentosDoMes.add(listaDeLancamento.get(j));
				}
			}
			if(lancamentosDoMes.size() != 0) {
				System.out.println("Lançamentos do mês " + i + ": ");
				System.out.println(lancamentosDoMes);
			}
		}
	}

	public static void printaLancamentoPorCategoria(List<Lancamento> listaDeLancamento, int categoria){
		for(int i = 0; i < listaDeLancamento.size(); i++){
			if(listaDeLancamento.get(i).getCategoria() == categoria){
				System.out.println(listaDeLancamento.get(i));
			}
		}
	}

	public static void printaFaturaPorMes(List<Lancamento> listaDeLancamento, int mes){
		Double contValor = 0D;
		for(int i = 0; i < listaDeLancamento.size(); i++){
			if(listaDeLancamento.get(i).getMes() == mes){
				contValor += listaDeLancamento.get(i).getValor();
			}
		}
		System.out.println("Fatura do mês " + mes + ": " + contValor);
	}

}
