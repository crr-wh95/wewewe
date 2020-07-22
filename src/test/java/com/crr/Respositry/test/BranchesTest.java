package com.crr.Respositry.test;

import com.crr.Repository.BranchesRepository;
import com.crr.domain.Branches;
import com.crr.service.BranchesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.util.Optional;

@SpringBootTest
public class BranchesTest {
    @Autowired
    private BranchesRepository branchesRepository;
    @Autowired
    private BranchesService branchesService;
    @Test
    public void getById(){
        Optional<Branches> branches = branchesRepository.findById(1);
        System.out.println(branches);
    }

    @Test
    public void test2(){
        Page<Branches> page = branchesService.getBranchesPage(1, 2);
        System.out.println(page);


    }


}
