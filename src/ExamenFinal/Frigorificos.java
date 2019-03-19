package ExamenFinal;

public class Frigorificos extends Electrodomésticos {
	
	enum TipoFrigo {NORMAL , NOFROST};
	
		private TipoFrigo Tipo = TipoFrigo.NOFROST;

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

	@Override
	public int precioFinal(Electrodomésticos Electrodomestico) {
		
		return super.precioFinal(Electrodomestico);
	}

}
