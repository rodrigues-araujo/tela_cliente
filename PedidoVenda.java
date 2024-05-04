package Tela;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PedidoVenda {
	private int numeroPedido;
	private  LocalDate dataCriacao;
	private LocalDate Entrega;
	private String infoComplementares;
	private double frete;
	private int quantidadeProduto;
	private double descontoValor;
	private double totalPedido;
	private Cliente cliente;
	private Contato contatoResp;
	private Transportadora transResp;
	public PedidoVenda(int numeroPedido, LocalDate dataCriacao, LocalDate entrega, String infoComplementares,
			double frete, int quantidadeProduto, double descontoValor, double totalPedido, Cliente cliente,
			Contato contatoResp, Transportadora transResp) {
		
		this.numeroPedido = numeroPedido;
		this.dataCriacao = dataCriacao;
		Entrega = entrega;
		this.infoComplementares = infoComplementares;
		this.frete = frete;
		this.quantidadeProduto = quantidadeProduto;
		this.descontoValor = descontoValor;
		this.totalPedido = totalPedido;
		this.cliente = cliente;
		this.contatoResp = contatoResp;
		this.transResp = transResp;
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public LocalDate getEntrega() {
		return Entrega;
	}
	public void setEntrega(LocalDate entrega) {
		Entrega = entrega;
	}
	public String getInfoComplementares() {
		return infoComplementares;
	}
	public void setInfoComplementares(String infoComplementares) {
		this.infoComplementares = infoComplementares;
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public double getDescontoValor() {
		return descontoValor;
	}
	public void setDescontoValor(double descontoValor) {
		this.descontoValor = descontoValor;
	}
	public double getTotalPedido() {
		return totalPedido;
	}
	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Contato getContatoResp() {
		return contatoResp;
	}
	public void setContatoResp(Contato contatoResp) {
		this.contatoResp = contatoResp;
	}
	public Transportadora getTransResp() {
		return transResp;
	}
	public void setTransResp(Transportadora transResp) {
		this.transResp = transResp;
	}
	
	
}
