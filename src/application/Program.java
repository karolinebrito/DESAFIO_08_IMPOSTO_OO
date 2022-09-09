package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite os dados do " + (i+1) + "o contribuinte:");
			System.out.print("Renda anual com salario: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestacao de servico: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			System.out.println();
			TaxPayer taxPayer = new TaxPayer(salaryIncome, 
											servicesIncome, 
											capitalIncome, 
											healthSpending, 
											educationSpending);
			list.add(taxPayer);
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("Resumo do " + (i+1) + "o contribuinte:");
			System.out.println("Imposto bruto total: " + String.format("%.2f", list.get(i).grossTax()));
			System.out.println("Abatimento: " + String.format("%.2f", list.get(i).taxRebate()));
			System.out.println("Imposto devido: " + String.format("%.2f", list.get(i).netTax()));
			System.out.println();
		}
		
		sc.close();

	}

}
