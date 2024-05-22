package com.project.ecommerce.buisiness;

import com.project.ecommerce.entities.ShirtModel;
import com.project.ecommerce.entities.dtos.ShirtRecordDto;
import com.project.ecommerce.repositories.ShirtRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.JavaBean;
import java.util.List;
import java.util.UUID;

@Service
public class ShirtService {

    @Autowired
    ShirtRepository shirtRepository;

    public ShirtModel registerShirt(ShirtRecordDto shirtRecordDto){
        ShirtModel newShirt = new ShirtModel();
        BeanUtils.copyProperties(shirtRecordDto, newShirt);
        try{
            shirtRepository.save(newShirt);
            return newShirt;
        }
        catch (Exception exception){
            throw exception;
        }

    }

    public List<ShirtModel> getAllShirts() {
        return shirtRepository.findAll();
    }

    public Object getShirt(UUID id) {
        return shirtRepository.findById(id);
    }
}
