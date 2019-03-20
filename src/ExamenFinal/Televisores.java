package ExamenFinal;

public class Televisores extends Electrodomésticos {
	
	enum TipoTDT {NORMAL, HD};
	Electrodomésticos Electrodomestico = new Electrodomésticos();
	
	private int Pulgada = 20 ;
	private TipoTDT TDT = TipoTDT.NORMAL;
	

	public int getPulgadas() {
		return Pulgadas;
	}

	public TipoTDT getTDT() {
		return TDT;
	}

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

	public Televisores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Televisores(int precioBase, int peso, TipoColor color, TipoLetra consumo ,int pulgada , TipoTDT tdt) {
		super(precioBase, peso, color, consumo);
		Pulgada=pulgada;
		TDT = tdt;
	}

	public Televisores(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}



}
