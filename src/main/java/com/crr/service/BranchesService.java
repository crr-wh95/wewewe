package com.crr.service;

import com.crr.domain.Branches;
import org.springframework.data.domain.Page;

public interface BranchesService {
    //改
    void updateBranches(Branches branches);
    //删
    void deleteBranches(Integer id);
    //查一个
    Branches getByBranchesId(Integer id);
    //查
    Page<Branches> getBranchesPage(Integer pageNow,Integer pageSize);
}
