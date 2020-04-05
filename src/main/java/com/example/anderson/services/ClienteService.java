package com.example.anderson.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.anderson.domain.Cliente;
import com.example.anderson.repository.ClienteRepository;
import com.example.anderson.services.exceptions.ObjectNotFoundExceptions;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExceptions(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}