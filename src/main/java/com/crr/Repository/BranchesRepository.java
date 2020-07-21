package com.crr.Repository;

import com.crr.domain.Branches;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchesRepository extends JpaRepository<Branches,Integer> {

    Branches findBranchesById(Integer id);

//     Page<Branches> findBranches(Pageable pageable);

}
