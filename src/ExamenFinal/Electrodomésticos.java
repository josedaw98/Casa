package ExamenFinal;

public class Electrodom�sticos {
	enum TipoColor {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	enum TipoLetra {
		A, B, C, D, E, F
	};

	private int PrecioBase = 100;
	private int Peso = 5;
	private TipoColor Color = TipoColor.BLANCO;
	private TipoLetra Consumo = TipoLetra.F;

	public Electrodom�sticos() {

	}

	public int getPrecioBase() {
		return PrecioBase;
	}

	public int getPeso() {
		return Peso;
	}

	public TipoColor getColor() {
		return Color;
	}

	public TipoLetra getConsumo() {
		return Consumo;
	}

	public Electrodom�sticos(int precioBase, int peso) {

		PrecioBase = precioBase;
		Peso = peso;
	}

	public Electrodom�sticos(int precioBase, int peso, TipoColor color, TipoLetra consumo) {

		PrecioBase = precioBase;
		Peso = peso;
		Color = color;
		Consumo = consumo;
	}

	@Override
	public String toString() {
		return "Electrodom�sticos [PrecioBase=" + PrecioBase + ", Peso=" + Peso + ", Color=" + Color + ", Consumo="
				+ Consumo + "]";
	}

	public int precioFinal(Electrodom�sticos Electrodomestico) {
		int PrecioFinal = 100;
		if (Electrodomestico.Consumo.equals(TipoLetra.A)) {
			PrecioFinal = +100;
		} else if (Electrodomestico.Consumo.equals(TipoLetra.B)) {
			PrecioFinal = +80;
		} else if (Electrodomestico.Consumo.equals(TipoLetra.C)) {
			PrecioFinal = +60;
		} else if (Electrodomestico.Consumo.equals(TipoLetra.D)) {
			PrecioFinal = +50;
		} else if (Electrodomestico.Consumo.equals(TipoLetra.E)) {
			PrecioFinal = +30;
		} else if (Electrodomestico.Consumo.equals(TipoLetra.F)) {
			PrecioFinal = +10;
		}

		while (Electrodomestico.Peso < 0) {
			System.out.println("Tama�o no valido, numero demasiado peque�o");
		}

		if (Electrodomestico.Peso <= 19) {
			PrecioFinal = +10;
		} else if (Electrodomestico.Peso <= 49) {
			PrecioFinal = +50;
		} else if (Electrodomestico.Peso <= 79) {
			PrecioFinal = +50;
		} else {
			PrecioFinal = +100;
		}

		return PrecioFinal;

	}

}	