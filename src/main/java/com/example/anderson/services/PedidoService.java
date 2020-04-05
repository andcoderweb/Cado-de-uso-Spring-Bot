package com.example.anderson.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.anderson.domain.Pedido;
import com.example.anderson.repository.PedidoRepository;
import com.example.anderson.services.exceptions.ObjectNotFoundExceptions;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExceptions(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}