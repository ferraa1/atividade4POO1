package atividade4POO1;

public class Main {

	public static void main(String[] args) {
		
		double z, r;
		int tipo;
		
		z = 8;
		r = 6;
		tipo = 1;
		Cone cone = new Cone(z, r, tipo);
		System.out.println("TESTE 1:");
		System.out.println(cone + "\n");

		z = 9;
		r = 3.5;
		tipo = 2;
		cone = new Cone(z, r, tipo);
		System.out.println("TESTE 2:");
		System.out.println(cone + "\n");

		z = 13.9;
		r = 20;
		tipo = 2;
		cone = new Cone(z, r, tipo);
		System.out.println("TESTE 3:");
		System.out.println(cone + "\n");

		z = 16.53;
		r = 37.78;
		tipo = 3;
		cone = new Cone(z, r, tipo);
		System.out.println("TESTE 4:");
		System.out.println(cone + "\n");

	}

}
