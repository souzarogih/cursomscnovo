package com.nelioalves.cursomscnovo.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.nelioalves.cursomscnovo.domain.enums.TipoCliente;
import com.nelioalves.cursomscnovo.dto.ClienteNewDTO;
import com.nelioalves.cursomscnovo.resources.exception.FieldMessage;
import com.nelioalves.cursomscnovo.services.validation.utils.BR;

public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {

	@Override 
    public void initialize(ClienteInsert ann) {     }

	@Override     
	public boolean isValid(ClienteNewDTO objDto, ConstraintValidatorContext context) { 
 
        List<FieldMessage> list = new ArrayList<>();      
        
        if(objDto.getTipo().equals(TipoCliente.PESSOAFISICA.getCod()) && !BR.isValidCPF(objDto.getCpfOuCnpj())) {
        	list.add(new FieldMessage("cpfOuCnpj", "CPF Inválido"));
        }
        
        if(objDto.getTipo().equals(TipoCliente.PESSOAJURIDICA.getCod()) && !BR.isValidCNPJ(objDto.getCpfOuCnpj())) {
        	list.add(new FieldMessage("cpfOuCnpj", "CNPJ Inválido"));
        }
        
        // inclua os testes aqui, inserindo erros na lista               
        for (FieldMessage e : list) {             
        	context.disableDefaultConstraintViolation();    
        	context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName()).addConstraintViolation();      
        	}
        return list.isEmpty();     
    }
} 