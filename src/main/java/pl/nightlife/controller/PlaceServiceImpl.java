package pl.nightlife.controller;


import org.springframework.stereotype.Service;
import pl.nightlife.persistence.repository.PlaceRepository;

import javax.annotation.Resource;

@Service
public class PlaceServiceImpl
{
    @Resource
    PlaceRepository repository;
}
