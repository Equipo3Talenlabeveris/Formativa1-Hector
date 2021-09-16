package com.everis.formativa.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")

public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//private ArrayList<Producto> articulos;
	//private Usuario comprador;
	private Integer valortotal;
	private Integer descuentototal;
	public Venta() {
		super();
		//ArrayList<Producto> productos = new ArrayList<Producto>();
		//this.articulos = productos;
	}
	public Venta(Integer valortotal, Integer descuentototal) {
		super();
		//this.articulos = productos;
		//this.comprador = comprador;
		this.valortotal = valortotal;
		this.descuentototal = descuentototal;
	}
	/*public ArrayList<Producto> getProductos() {
		return articulos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.articulos = productos;
	}
	public Usuario getComprador() {
		return comprador;
	}
	public void setComprador(Usuario comprador) {
		this.comprador = comprador;
	}*/
	public Integer getValortotal() {
		return valortotal;
	}
	public void setValortotal(Integer valortotal) {
		this.valortotal = valortotal;
	}
	public Integer getDescuentototal() {
		return descuentototal;
	}
	public void setDescuentototal(Integer descuentototal) {
		this.descuentototal = descuentototal;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
