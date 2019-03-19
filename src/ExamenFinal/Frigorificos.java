package ExamenFinal;

public class Frigorificos extends Electrodomésticos {
	
	enum TipoFrigo {NORMAL , NOFROST};
	
		private TipoFrigo Tipo = TipoFrigo.NOFROST;
		Electrodomésticos Electrodomestico = new Electrodomésticos();

	@Override
	public int getPrecioBase() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}

	@Override
	public TipoColor getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public TipoLetra getConsumo() {
		// TODO Auto-generated method stub
		return super.getConsumo();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	public Frigorificos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frigorificos(int precioBase, int peso, TipoColor color, TipoLetra consumo , TipoFrigo tipo) {
		super(precioBase, peso, color, consumo);
		Tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	public TipoFrigo getTipo() {
		return Tipo;
	}

	public Electrodomésticos getElectrodomestico() {
		return Electrodomestico;
	}

	public Frigorificos(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public int precioFinal(Frigorificos Frigorifico) {
		
		return super.precioFinal(Electrodomestico);
	}

}
