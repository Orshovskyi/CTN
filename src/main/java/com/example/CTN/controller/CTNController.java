package com.example.CTN.controller;

import com.example.CTN.dto.EventType;
import com.example.CTN.dto.ObjectType;
import com.example.CTN.model.CTN;
import com.example.CTN.model.Views;
import com.example.CTN.repo.CTNRepo;
import com.example.CTN.util.WsSender;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.BiConsumer;

@RestController
@RequestMapping("ctn")
public class CTNController {

    private final CTNRepo ctnRepo;
    private final BiConsumer<EventType, CTN> wsSender;

    @Autowired
    public CTNController(CTNRepo ctnRepo, WsSender wsSender) {
        this.ctnRepo = ctnRepo;
        this.wsSender = wsSender.getSender(ObjectType.MESSAGE, Views.IdType.class);
    }

    @GetMapping
    @JsonView(Views.IdType.class)
    public List<CTN> list(){
        return ctnRepo.findAll();
    }

    @GetMapping("{id}")
    public CTN getOne(@PathVariable("id") CTN ctn){
        return ctn;
    }


    @PostMapping
    public CTN create(@RequestBody CTN ctn){
        CTN createdCtn = ctnRepo.save(ctn);
        wsSender.accept(EventType.CREATE, createdCtn);

        return createdCtn;
    }

    @PutMapping("{id}")
    public CTN update(@PathVariable("id") CTN ctnFromDb,
                      @RequestBody CTN ctn){
        BeanUtils.copyProperties(ctn, ctnFromDb, "id");

        CTN updatedCtn = ctnRepo.save(ctnFromDb);
        wsSender.accept(EventType.UPDATE, updatedCtn);
        return updatedCtn;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") CTN ctn){
            ctnRepo.delete(ctn);
              wsSender.accept(EventType.REMOVE, ctn);
    }

}
