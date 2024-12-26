package edu.icet.crm.controller;

import edu.icet.crm.dto.publisher.PublisherDto;
import edu.icet.crm.dto.publisher.PublisherSaveDto;
import edu.icet.crm.dto.publisher.PublisherUpdateDto;
import edu.icet.crm.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/publisher")
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @PostMapping("/save")
    public String savePublisher(@RequestBody PublisherSaveDto publisherSaveDto){
        publisherService.addPublisher(publisherSaveDto);
        return "Added success...";

    }
    @GetMapping("/getAllPublisher")
    public List<PublisherDto> getAllPublishers(){
        return publisherService.getAllPublishers();
    }
    @PutMapping("/update")
    public String updatePublisher(@RequestBody PublisherUpdateDto publisherUpdateDto){

        return publisherService.updatePublisher(publisherUpdateDto);

    }

    @DeleteMapping("/delete/{id}")
    public String deletePublisher(@PathVariable(value = "id")int id){

        publisherService.deletePublisher(id);
        return "Publisher deleted";
    }

}
