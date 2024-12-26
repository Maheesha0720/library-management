package edu.icet.crm.service.impl;

import edu.icet.crm.dto.publisher.PublisherDto;
import edu.icet.crm.dto.publisher.PublisherSaveDto;
import edu.icet.crm.dto.publisher.PublisherUpdateDto;
import edu.icet.crm.entity.Publisher;
import edu.icet.crm.repository.PubliblisherRepo;
import edu.icet.crm.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService{

    @Autowired
    private PubliblisherRepo publiblisherRepo;

    @Override
    public String addPublisher(PublisherSaveDto publisherSaveDto) {
        Publisher publisher =new Publisher(
                publisherSaveDto.getPublisherName()
        );
        publiblisherRepo.save(publisher);
        return publisher.getPublisherName();

    }

    @Override
    public List<PublisherDto> getAllPublishers() {

        List<Publisher> publisherDtos=publiblisherRepo.findAll();
        List<PublisherDto> publisherDtoList=new ArrayList<>();

        for (Publisher publisher:publisherDtos){
            PublisherDto publisherDto=new PublisherDto(
                    publisher.getPublisherId(),
                    publisher.getPublisherName()
            );
            publisherDtoList.add(publisherDto);
        }
        return publisherDtoList;

    }

    @Override
    public String updatePublisher(PublisherUpdateDto publisherUpdateDto) {
        if (publiblisherRepo.existsById(publisherUpdateDto.getPublisherId())) {

            Publisher publisher = publiblisherRepo.getById(publisherUpdateDto.getPublisherId());
            publisher.setPublisherName(publisherUpdateDto.getPublisherName());
            publiblisherRepo.save(publisher);
            return publisher.getPublisherName();
        }else {
            System.out.println("Publisher ID not exist...!!");
        }
        return null;

    }

    @Override
    public String deletePublisher(int id) {
        if (publiblisherRepo.existsById(id)){
            publiblisherRepo.deleteById(id);
        }else{
            System.out.println("record not found..");
        }
        return null;
    }
}
