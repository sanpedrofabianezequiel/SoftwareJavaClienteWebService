package com.educacionIT.curso.principal;

import java.rmi.RemoteException;

import org.tempuri.CalculatorSoap;
import org.tempuri.CalculatorSoapProxy;

public class App {
	public static void main(String[] args) {
		CalculatorSoap calculadora= new CalculatorSoapProxy("http://www.dneonline.com/calculator.asmx?wsdl");
		try {
			System.out.println(calculadora.add(5, 10));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
