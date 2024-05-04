package Tela;

public class ItemPedido {
		private Produto prod;
		private double descontoPorcento;
		private double descontoRS;
		private int quantidade;
		private double total;
		public ItemPedido(Produto prod, double descontoPorcento, double descontoRS, int quantidade, double total) {
			this.prod = prod;
			this.descontoPorcento = descontoPorcento;
			this.descontoRS = descontoRS;
			this.quantidade = quantidade;
			this.total = total;
		}
		public Produto getProd() {
			return prod;
		}
		public void setProd(Produto prod) {
			this.prod = prod;
		}
		public double getDescontoPorcento() {
			return descontoPorcento;
		}
		public void setDescontoPorcento(double descontoPorcento) {
			this.descontoPorcento = descontoPorcento;
		}
		public double getDescontoRS() {
			return descontoRS;
		}
		public void setDescontoRS(double descontoRS) {
			this.descontoRS = descontoRS;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		
		
}
