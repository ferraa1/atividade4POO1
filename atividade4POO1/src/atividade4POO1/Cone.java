package atividade4POO1;

public class Cone {

	private double z, r;
	private int tipo;

	public Cone() {
		super();
	}

	public Cone(int tipo) {
		super();
		this.tipo = tipo;
	}

	public Cone(double r) {
		super();
		this.r = r;
	}

	public Cone(double z, double r) {
		super();
		this.z = z;
		this.r = r;
	}

	public Cone(double r, int tipo) {
		super();
		this.r = r;
		this.tipo = tipo;
	}

	public Cone(double z, double r, int tipo) {
		super();
		this.z = z;
		this.r = r;
		this.tipo = tipo;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double geratriz() {
		return Math.sqrt(z * z + r * r);
	}

	public double areaFundo() {
		return 3.14 * (r * r);
	}

	public double areaLateral() {
		return 3.14 * r * geratriz();
	}

	public double areaTotal() {
		return 3.14 * r * (r + geratriz());
	}

	public double litros() {
		return areaTotal() * 3.45;
	}

	public int latas() {
		return (int) ((litros() + 17) / 18);
	}

	public double preco() {
		switch (tipo) {
		case 1: {
			return latas() * 238.9;
		}
		case 2: {
			return latas() * 467.98;
		}
		case 3: {
			return latas() * 758.34;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("– Cone");
		builder.append("\r\nRaio: ");
		builder.append(r);
		builder.append("\r\nAltura: ");
		builder.append(z);
		builder.append("\r\nNível: ");
		builder.append(tipo);
		builder.append("\r\n----------");
		builder.append("\r\nGeratriz: ");
		builder.append(geratriz());
		builder.append("\r\n----------");
		builder.append("\r\nÁrea do Fundo: ");
		builder.append(areaFundo());
		builder.append("\r\nÁrea Lateral Cone: ");
		builder.append(areaLateral());
		builder.append("\r\nÁrea Total: ");
		builder.append(areaTotal());
		builder.append("\r\n----------");
		builder.append("\r\nLitros: ");
		builder.append(litros());
		builder.append("\r\nLatas: ");
		builder.append(latas());
		builder.append("\r\n----------");
		builder.append("\r\nPreço Total: ");
		builder.append(preco());
		return builder.toString();
	}

}
