package com.crr.service.impl;

import com.crr.Repository.BranchesRepository;
import com.crr.domain.Branches;
import com.crr.service.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BranchesServiceImpl implements BranchesService {
    @Autowired
    private BranchesRepository branchesRepository;

    @Override
    public void updateBranches(Branches branches) {
        branchesRepository.save(branches);
    }

    @Override
    public void deleteBranches(Integer id) {
        branchesRepository.deleteById(id);
    }

    @Override
    public Branches getByBranchesId(Integer id) {
        return branchesRepository.findBranchesById(id);
    }

    @Override
    public Page<Branches> getBranchesPage(Integer pageNow, Integer pageSize) {
       if(pageNow == null || pageNow < 1){
           pageNow = 4;
       }if (pageSize == null){
         pageSize =5;
        }
        Pageable pageable = PageRequest.of(pageNow - 1, pageSize, Sort.Direction.ASC, "id");
        Page<Branches> page = branchesRepository.findAll(pageable);
        return page;
    }
}
