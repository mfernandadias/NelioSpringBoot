package exemploDidatico.app;

import exemploDidatico.entities.Employee;
import exemploDidatico.services.BrazilTaxService;
import exemploDidatico.services.PensionService;
import exemploDidatico.services.SalaryService;
import exemploDidatico.services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);


        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Salario bruto: ");
        double grossSalary = scan.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        //explicação oq esta ocorrendo aqui 
        TaxService taxService = new BrazilTaxService();

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);

        System.out.printf("Salario liquido = %.2f%n", netSalary);

        scan.close();

    }
}
