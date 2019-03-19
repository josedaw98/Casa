package ExamenFinal;

public class Lavadoras extends Electrodomésticos {

	int Carga = 5;
	
	Electrodomésticos Electrodomestico = new Electrodomésticos();
		
	@Override
	public int getPrecioBase() {
		
		return super.getPrecioBase();
	}

	public int getCarga() {
		return Carga;
	}

	@Override
	public int getPeso() {
		
		return super.getPeso();
	}

	@Override
	public TipoColor getColor() {
		
		return super.getColor();
	}

	@Override
	public TipoLetra getConsumo() {
		
		return super.getConsumo();
	}

	@Override
	public String toString() {

		return super.toString();
	}



	public Lavadoras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lavadoras(int precioBase, int peso, TipoColor color, TipoLetra consumo ,int carga) {
		super(precioBase, peso, color, consumo);
		Carga = carga;
	}

	public Lavadoras(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public int precioFinal(Lavadoras Lavadora) {
		if(Lavadora.Carga>8) {
		return super.precioFinal(Electrodomestico)+50;
		}else {
			return super.precioFinal(Electrodomestico);
		}
	}

}
