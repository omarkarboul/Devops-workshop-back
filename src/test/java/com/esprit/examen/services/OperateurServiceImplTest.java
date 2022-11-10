package com.esprit.examen.services;


import com.esprit.examen.repositories.OperateurRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class OperateurServiceImplTest {

    @Autowired
    OperateurRepository operateurRepository;

    @Autowired
    OperateurServiceImpl operateurService;
}
