package com.heinsohn.prueba;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);

		System.out.println("cantidad de fibonacci que quiere realizar");
		int cantidad = scann.nextInt();

		int a = 0, b = 1, x;

		for (int i = 1; i < cantidad; i++) {
			if (i <= 1) {
				x = i;
			} else {
				x = b + a;
				b = a;
				a = x;
				if (a > cantidad) {
					break;
				}
			}
			System.out.println(a + " ");
		}

	}

}
